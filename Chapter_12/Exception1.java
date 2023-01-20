package Chapter_12;
// Note: You can handele exception by using the try-catch-finally block.
public class Exception1 {
  public static void main(String[] args) {
    try {
      int myNumbers[] = { 1, 2, 3 };
      System.out.println(myNumbers[10]);
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
