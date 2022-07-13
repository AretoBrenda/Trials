import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input first integer: ");
    int x = input.nextInt();
    
    System.out.println("Input second integer: ");
    int y = input.nextInt();
    
    System.out.println("Input third integer: ");
    int z = input.nextInt();
    
    System.out.print("The result is: " +test_last_digit(x, y, z, true));
    	System.out.print("\n");
  }
  public static boolean test_last_digit(int p, int q, int r, boolean xyz) {
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
     }
}
  
