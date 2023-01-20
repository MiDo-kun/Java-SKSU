package Chapter5a;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FavoriteCharacter {
  public static void main(String args[]) throws IOException{
    System.out.print("Hi, what's your favorite character? ");
    char favChar;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    favChar = (char) br.read();
    System.out.println(favChar + " is a good choice!");
  }
}
