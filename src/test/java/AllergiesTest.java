import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AllergiesTest {

  @Test
  public void allergens_128_cat() {
    Allergies newAllergies = new Allergies();
    ArrayList<Object> expected = new ArrayList();
    expected.add("cats");
    assertEquals(expected, newAllergies.allergens(128));
  }

  @Test
  public void allergens_70_array() {
    Allergies newAllergies = new Allergies();
    ArrayList<Object> expected = new ArrayList();
    expected.add("pollen");
    expected.add("shellfish");
    expected.add("peanuts");
    assertEquals(expected, newAllergies.allergens(70));
  }

  @Test
  public void allergens_256_array() {
    Allergies newAllergies = new Allergies();
    ArrayList<Object> expected = new ArrayList();
    expected.add("cats");
    expected.add("pollen");
    expected.add("chocolate");
    expected.add("tomatoes");
    expected.add("strawberries");
    expected.add("shellfish");
    expected.add("peanuts");
    expected.add("eggs");
    assertEquals(expected, newAllergies.allergens(256));
  }
}
