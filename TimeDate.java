//You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. 
//The following example will remove both the "T" and nanoseconds from the date-time:

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Main {
  public static void main(String[] args) {  
    LocalDateTime myDateObj = LocalDateTime.now();  
    System.out.println("Before formatting: " + myDateObj);  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("After formatting: " + formattedDate);  
  }  
}  

