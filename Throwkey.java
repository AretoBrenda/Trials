//Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":


public class Main {
  static void checkAge(int age) {
    if(age < 18) {
   throw new ArithmeticException("Access denied: You must be atleast 18 years old");
    } else {
       System.out.println("Access granted: You are old enough");
  }
}
public static void main(String[] args) {
  checkAge(20);
}
}
