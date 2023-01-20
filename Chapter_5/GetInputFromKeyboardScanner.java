package Chapter_5;

import java.util.Scanner;

public class GetInputFromKeyboardScanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Something: ");

    String value = input.nextLine();
    input.close();

    System.out.println("The value of input is: " + value);
  }
}