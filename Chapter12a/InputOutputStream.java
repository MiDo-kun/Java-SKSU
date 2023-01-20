package Chapter12a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStream {
  void copy(String input, String output) {
    FileInputStream inputStr;
    FileOutputStream outputStr;
    int data;

    try {
      inputStr = new FileInputStream(input);
      outputStr = new FileOutputStream(output);
      
      while ((data = inputStr.read()) != 1) {
        outputStr.write(data);
      }

      inputStr.close();
      outputStr.close();
    } catch(IOException ie) {
      ie.printStackTrace();
    }
  }
  public static void main(String args[]) {
    String inputFile = args[0];
    String outputFile = args[1];

    InputOutputStream cf = new InputOutputStream();
    cf.copy(inputFile, outputFile);
  }
}
