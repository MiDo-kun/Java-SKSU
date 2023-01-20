package Chapter_7;
public class ArraySample {
  public static void main(String[] args) {
    int ages[] = new int[100];
    // System.out.println(ages.length);
    for (int i = 0; i < ages.length; i++) {
      ages[i] = i;
      System.out.println(ages[i]);
    }
  }
}