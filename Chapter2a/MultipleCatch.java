package Chapter2a;

import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class MultipleCatch {
  public static void main(String[] args) {
    try {
      int den = Integer.parseInt(args[0]);
      System.out.println(3 / 0); // Throws and ArithmeticException
      System.out.println(3 / den); // Throws an ArrayIndexOutOfBoundsException
      System.out.println("Pls. Print me.");
    } catch (ArithmeticException err) {
      System.out.println(err); // You can create your custom error handling here.
    } catch (ArrayIndexOutOfBoundsException err) {
      // Performing multiple catch in exception handling.
      // Cathing errors specifically.
      System.out.println(err);
    }
  }
}