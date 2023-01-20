package Chapter3a;

public class DecToOthersRecur {
  public static void main(String args[]) {
    // int num = Integer.parseInt(args[0]);
    // int base = Integer.parseInt(args[1]);
    int num = 40;
    int base = 3;
    printBase(num, base);
  }
  static void printBase(int num, int base) {
    String digits = "0123456789abcdef";

    // Recursive Step
    if (num >= base) {
      printBase(num/base, base);
    }

    // Base Case: num < base
    System.out.println(digits.charAt(num % base));
  }
}
