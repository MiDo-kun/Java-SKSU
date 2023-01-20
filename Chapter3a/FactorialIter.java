package Chapter3a;

public class FactorialIter {
  public static void main(String args[]) {
    // int n = Integer.parseInt(args[0]);
    int n = 4;
    System.out.println(factorial(n));
  }

  static int factorial(int n) {
    int result = 1;
    for (int i = n; i > 1; i--) {
      result = result * i;
    }

    return result;
  }
}
