package Chapter2a;

import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class NestedTry2 {
  public static void main(String[] args) {
    try {
      nestedTry(args);
    } catch(ArrayIndexOutOfBoundsException err) {
      System.out.println("Need 2 parameters!");
    }
  }

  static void nestedTry(String args[]) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println(a / b);

    } catch(ArithmeticException e) {
      System.out.println("Div by zero error!");
    }
  }
}
