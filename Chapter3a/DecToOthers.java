package Chapter3a;

public class DecToOthers {
  public static void main(String args[]) {
    int num = 2;
    int base = 16;
    printBase(num, base);
  }

  static void printBase(int num, int base) {
    int rem = 1;
    String digits = "123456789abcdef";
    String result = "";

    while (num != 0) {
      rem = num % base;
      num = num /base;
      result = result.concat(digits.charAt(rem) + "");
    }

    for (int i = result.length() - 1; i >= 0; i--) {
      System.out.println(result.charAt(i));
    }
  }
}
