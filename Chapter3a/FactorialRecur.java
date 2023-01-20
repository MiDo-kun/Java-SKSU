package Chapter3a;

public class FactorialRecur {
  static int factorial(int n) {
    if (n == 1) {
      return 1;
    } 
    return factorial(n - 1) * n;
  }

  public static void main(String args[]) {
    int n = 4;
    System.out.println(factorial(n));
  }
}
