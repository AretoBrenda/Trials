//Use an iterator to remove numbers less than 10 from a collection:

import java.util.Iterator;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList< Integer>();
    numbers.add(20);
    numbers.add(35);
    numbers.add(40);
    numbers.add(80);
    Iterator<Integer> it = numbers.iterator();
   while(it.hasNext()) {
     Integer i = it.next();
     if(i < 10) {
       it.remove();
     }
   }
    System.out.println(numbers);
  }
}
