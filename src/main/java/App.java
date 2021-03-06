import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main (String[] args){
    String layout = "templates/layout.vtl";

    get("/", (request, response) ->{
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String stringAllergenScore = request.queryParams("allergenScore");
      Integer inputtedAllergenScore = Integer.parseInt(stringAllergenScore);

      Allergies myAllergies = new Allergies();
      ArrayList<Object> results = myAllergies.allergens(inputtedAllergenScore);

      model.put("results", results);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
