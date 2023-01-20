package Chapter12a;

import java.io.*;

public class ModifiedCopyFile {
  void copy(String input, String output) {
    BufferedReader reader;
    BufferedWriter writer;
    String data;

    try {
      reader = new BufferedReader(new FileReader(input));
      writer = new BufferedWriter(new FileWriter(output));

      while ((data = reader.readLine()) != null) {
        writer.write(data, 0, data.length());
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
