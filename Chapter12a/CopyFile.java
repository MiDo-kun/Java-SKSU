package Chapter12a;

import java.io.*;

public class CopyFile {
  void copy(String input, String output)  {
    FileReader reader;
    FileWriter writer; 
    int data;

    try {
      reader = new FileReader(input);
      writer = new FileWriter(output);

      while ((data = reader.read()) != -1) {
        writer.write(data);
      }

      reader.close();
      writer.close();
    } catch (IOException ie) {
      ie.printStackTrace();
    }
  }

  public static void main(String args[]) {
    String inputFile = args[0];
    String outputFile = args[1];

    CopyFile cf = new CopyFile();
    cf.copy(inputFile, outputFile);
  }
}
