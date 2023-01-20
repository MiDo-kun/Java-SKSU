package Chapter2a;

import java.lang.RuntimeException;

public class FinallyDemo {
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      try {
        FinallyDemo.myMethod(i);
      } catch (Exception err) {
        System.out.println("Exception caught: ");
        System.out.println(err.getMessage());
      }
    }
  }

  static void myMethod(int n) throws Exception {
    try {
      switch (n) {
        case 1:
          System.out.println("1st case");
        case 3:
          System.out.println("3rd case");
          throw new RuntimeException("3!");
        case 4:
          System.out.println("4th case");
          throw new Exception("4!");
        case 2:
          System.out.println("2nd case");
      }
    } catch (RuntimeException err) {
      System.out.print("RuntimeException: ");
      System.out.println(err.getMessage());
    } finally {
      System.out.println("try-block entered.");
    }
  }
}
