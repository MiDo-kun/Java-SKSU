package Chapter2a;

import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class NestedTryDemo {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      try {
        int b = Integer.parseInt(args[1]);
        System.out.println(a/b);
      } catch(ArithmeticException err) {
        System.out.println("Div by zero error!");
      }
    } catch(ArrayIndexOutOfBoundsException err ) {
      System.out.println("Need 2 parameters");
    }
  }
}
