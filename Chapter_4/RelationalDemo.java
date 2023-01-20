package Chapter_4;

public class RelationalDemo {
  public static void main(String[] args) {
    int i = 37;
    int j = 42;
    int k = 42;

    System.out.println("Variable values...");
    System.out.println(" i = " + i);
    System.out.println(" j = " + j);
    System.out.println(" k = " + k);

    // Greater than operator
    System.out.println("Greater than...");
    System.out.println(" i > j is " + (i > j));
    System.out.println(" j > i is " + (j > i));
    System.out.println(" k > j is " + (k > j));

    // Greater than or equal to
    System.out.println("Greater than or equal to...");
    System.out.println(" i >= j is " + (i >= j));
    System.out.println(" j >= i is " + (j >= i));
    System.out.println(" k >= j is " + (k >= j));

    // Less than operator
    System.out.println("Less than...");
    System.out.println(" i < j is " + (i < j));
    System.out.println(" j < i is " + (j < i));
    System.out.println(" k < j is " + (k < j));

    // Less than or equal to
    System.out.println("Less than or equal to...");
    System.out.println(" i <= j is " + (i <= j));
    System.out.println(" j <= i is " + (j <= i));
    System.out.println(" k <= j is " + (k <= j));

    // Equal to
    System.out.println("Equal to...");
    System.out.println(" i == j is " + (i == j));
    System.out.println(" j == k is " + (j == k));

    // Not Equal to
    System.out.println("Not equal to...");
    System.out.println(" i != j is " + (i != j));
    System.out.println(" j != k is " + (j != k));
  }
}
