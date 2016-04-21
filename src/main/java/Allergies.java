import java.util.ArrayList;

public class Allergies {
  public ArrayList<Object> allergens(Integer score){
    ArrayList<Object> allergensList = new ArrayList();
    if (score > 255) {
      score = 255;
    }
    while (score > 0) {
      if (score >= 128) {
        allergensList.add("cats");
        score -= 128;
      }else if (score < 128 && score >= 64) {
        allergensList.add("pollen");
        score -=64;
      }else if (score < 64 && score >= 32) {
        allergensList.add("chocolate");
        score -=32;
      }else if (score < 32 && score >= 16) {
        allergensList.add("tomatoes");
        score -=16;
      } else if (score < 16 && score >= 8) {
        allergensList.add("strawberries");
        score -=8;
      }else if (score < 8 && score >= 4) {
        allergensList.add("shellfish");
        score -=4;
      }else if (score < 4 && score >= 2) {
        allergensList.add("peanuts");
        score -=2;
      }else {
        allergensList.add("eggs");
        score -=1;
      }
    }
    return allergensList;
  }
}
