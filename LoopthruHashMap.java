//Loop through the items of a HashMap with a for-each loop.

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Uganda", "Kampala");
    
    for (String i : capitalCities.keySet()) {
      System.out.println(i);
    }
  }
}
