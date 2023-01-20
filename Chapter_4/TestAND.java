package Chapter_4;

public class TestAND {
  public static void main(String[] args) {
    int i = 0;
    int j = 10;
    boolean test = false;

    // Demonstrate &&
    test = (i > 10) && (j++ > 9);
    System.out.println(i);
    System.out.println(j);
    System.out.println(test);

    // Demonstrate &
    test = (i > 10) & (j++ > 9);
    System.out.println(i);
    System.out.println(j);
    System.out.println(test);

    // Demonstrate ||
    test = (i > 10) || (j++ > 9);
    System.out.println(i);
    System.out.println(j);
    System.out.println(test);

    // Demonstrate |
    test = (i > 10) | (j++ > 9);
    System.out.println(i);
    System.out.println(j);
    System.out.println(test);
  }
}
