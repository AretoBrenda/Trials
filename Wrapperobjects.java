//For example, the following methods are used to get the value associated with the corresponding wrapper object: intValue(), 
//byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().

//This example will output the same result as the example above:

public class Main { 
  public static void main(String[] args) { 
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}

