package Chapter4a;

public class StringConstructorsDemo {
  public static void main(String args[]) {
    String s1 = new String();
    char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
    String s2 = new String(chars);
    byte bytes[] = {'w', 'o', 'r', 'l', 'd'};
    String s3 = new String(bytes);
    String s4 = new String(chars, 1, 3);
    String s5 = new String(s2);
    String s6 = s2;

    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    System.out.println("s3: " + s3);
    System.out.println("s4: " + s4);
    System.out.println("s5: " + s5);
    System.out.println("s6: " + s6);
  }
}