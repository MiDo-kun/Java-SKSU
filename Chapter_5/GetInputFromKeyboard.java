package Chapter_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {
  public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    String name = "";

    try {
      System.out.print(" Please Enter Your Name: " + dataIn.readLine());

      throw new IOException("Error Example");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(" Hello " + name + "!");
  }
}