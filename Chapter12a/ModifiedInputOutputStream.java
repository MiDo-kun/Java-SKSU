package Chapter12a;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PushbackInputStream;

public class ModifiedInputOutputStream {
  void copy(String input) {
    PushbackInputStream inputStr;
    PrintStream outputStr;
    int data;

    try {
      inputStr = new PushbackInputStream(new FileInputStream(input));
      outputStr = new PrintStream(System.out);

      while ((data = inputStr.read()) != -1) {
        outputStr.println("Read data: " + (char) data);
        inputStr.unread(data);
        data = inputStr.read();
        outputStr.println("Unread data: " + (char) data);
      }

      inputStr.close();
      outputStr.close();
    } catch (IOException ie) {
      ie.printStackTrace();
    }
  }

  public static void main(String args[]) {
    String inputFile = args[0];
    ModifiedInputOutputStream cf = new ModifiedInputOutputStream();
    cf.copy(inputFile);
  }
}
