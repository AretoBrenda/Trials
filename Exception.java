//If an error occurs, we can use try...catch to catch the error and execute some code to handle it:

public class Main {
public static void main(String[] args) {
  try {
    int[] myNumbers = {1, 2, 3, 4};
    System.out.println(myNumbers[10]);
  }
    catch (Exception e) {
      System.out.println("Something went wrong");
    }
  }
}
