//Enums are often used in switch statements to check for corresponding values:

enum Level {
  LOW,
  MEDIUM,
  HIGH
  }
public class Main {
  public static void main(String[] args) {
    Level myVar = Level. MEDIUM;
    switch(myVar) {
      case LOW:
        System.out.println("LOW level");
        break;
      case MEDIUM:
        System.out.println("MEDIUM level");
        break;
      case HIGH:
        System.out.println("HIGH level");
        break;
    }
  }
}
