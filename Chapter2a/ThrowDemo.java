package Chapter2a;

import java.lang.RuntimeException;

public class ThrowDemo {
  public static void main(String[] args)   {
    String input = "Invalid Input";
    try {
      if (input.equals("Invalid Input")) {
        throw new RuntimeException("throw demo.");
      } else {
        System.out.println(input);
      }
      System.out.println("After throwing");
    } catch(RuntimeException err) {
      System.out.println("Exception caught: " + err.getMessage());
    }
  }
}
