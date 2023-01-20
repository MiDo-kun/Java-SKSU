package Chapter5a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreetUser {
  public static void main(String args[]) throws IOException{
    System.out.print("Hi, what's your name? ");
    String name;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    name = br.readLine();

    System.out.println("Nice to meet you, " + name + "! :)");
  }
}
