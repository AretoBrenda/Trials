//The HashMap class has many useful methods. For example, to add items to it, use the put() method:

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Russia", "Moscow");
    capitalCities.put("Uganda", "Kampala");
    System.out.println(capitalCities);
  }
}
