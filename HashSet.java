//The HashSet class has many useful methods. For example, to add items to it, use the add() method:


import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Toyota Velfire");
    cars.add("Ford");
    cars.add("Lexus");
    cars.add("Toyota Prado");
    System.out.println(cars);
  }
}
