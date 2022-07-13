//Create a HashMap object called people that will store String keys and Integer values:


import java.util.HashMap;


public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    people.put("John", 34);
    people.put("Brenda", 25);
    people.put("Eunice", 26);
    people.put("Norman", 20);
    for(String i : people.keySet()) {
      System.out.println("key: " + i + "value: " + people.get(i));
      }
  }
}
