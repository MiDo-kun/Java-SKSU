package Chapter2a;

import java.lang.ClassNotFoundException;

public class ThrowingClass {
  static void meth() throws ClassNotFoundException {
    throw new ClassCastException("Demo");
  }

  class ThrowsDemo {
    public static void main(String[] args) {
      try {
        ThrowingClass.meth();
      } catch (ClassNotFoundException err) {
        System.out.println(err.getMessage());
      }
    }
  }
}
