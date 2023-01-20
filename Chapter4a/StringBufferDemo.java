package Chapter4a;

public class StringBufferDemo {
  public static void main(String args[]) {
    StringBuffer sb = new StringBuffer("Jonathan");
    System.out.println("sb = " + sb);
    // initial capacity is 16
    System.out.println("Capacity of sb: " + sb.capacity());

    System.out.println("Append \'0\' to sb: " + sb.append("0"));
    System.out.println("sb = " + sb);
    System.out.println("3rd character of sb: " + sb.charAt(2));

    char charArr[] = "Hi XX".toCharArray();
    // Need to add 1 to the endSrc index of getChars
    sb.getChars(0, 2, charArr, 3);
    System.out.print("getChars method: ");
    System.out.println(charArr);
    System.out.println("Insert \'jo\' at the 3rd cell: " + sb.insert(2, "jo"));
    System.out.println("Delete \'jo\'i at the 3rd cell: " + sb.delete(2, 4));
    System.out.println("Length of sb: " + sb.length());
    System.out.println("Replace: " + sb.replace(3, 9, " Ong"));
    
    // Need to add 1 to the endIndex parameter of substring
    System.out.println("Substring (1st tow characters): " + sb.substring(0, 2));
    System.out.println("Implicit toString(): " + sb);
  }
}