//Loop through the items of an HashSet with a for-each loop:

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Toyota Velfire");
    cars.add("Ford");
    cars.add("Lexus");
    cars.add("Toyota Prado");
    System.out.println(cars);
    for(String i : cars) {
      System.out.println(i);
  }
}
}
