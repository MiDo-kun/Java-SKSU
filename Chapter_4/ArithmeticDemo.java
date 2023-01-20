package Chapter_4;

public class ArithmeticDemo {
  public static void main(String[] args) {
    int i = 37;
    int j = 42;
    double x = 27.475;
    double y = 7.22;

    System.out.println(" Variable values...");
    System.out.println("  i = " + i);
    System.out.println("  j = " + j);
    System.out.println("  x = " + x);
    System.out.println("  y = " + y + "\n");

    // Adding numbers
    System.out.println(" Adding...");
    System.out.println("    i + j = " + (i + j));
    System.out.println("    x + y = " + (x + y));

    // Subtracting numbers
    System.out.println(" Subtracting... ");
    System.out.println("    i - j = " + (i - j));
    System.out.println("    x - y = " + (x - y));

    // Multiplying numbers
    System.out.println(" Multiplying... ");
    System.out.println("    i * j = " + (i * j));
    System.out.println("    x * y = " + (x * y));

    // Dividing numbers
    System.out.println(" Dividing... ");
    System.out.println("    i / j = " + (i / j));
    System.out.println("    x / y = " + (x / y));

    // Using Modulus operator
    System.out.println(" Computing the remainder... ");
    System.out.println("    i % j = " + (i % j));
    System.out.println("    x % y = " + (x % y));

    // Mixing types
    System.out.println(" Mixing types... ");
    System.out.println("    j + y = " + (j + y));
    System.out.println("    i * x = " + (i * x));
  }
}