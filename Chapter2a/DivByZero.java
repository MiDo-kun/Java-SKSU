package Chapter2a;

import java.lang.ArithmeticException;

public class DivByZero {
  public static void main(String[] args) {
    try {
    System.out.println(3/0); // Throws and ArithmeticException
    System.out.println("Pls. Print me.");
    } catch (ArithmeticException err) {
      System.out.println(err); // You can create your custom error handling here.
    }
 }
}