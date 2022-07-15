//In the following example, we use the FileWriter class together with its write()
//method to write some text to the file we created in the example above.
//Note that when you are done writing to the file, you should close it with the close() method:


import java.io.FileWriter;
import java.io.IOException;

public class Main {  
  public static void main(String[] args) {  
    try {  
      FileWriter myWriter = new FileWriter("gospelMusic.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("I love gospel music.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 
