package Chapter12a;

import java.io.*;
import java.net.CacheRequest;

public class UnserializeBoolean {
  UnserializeBoolean() {
    Boolean booleanData = null;
    try {
      FileInputStream fis = new FileInputStream("boolean.set");
      ObjectInputStream ois = new ObjectInputStream(fis);
      booleanData = (Boolean) ois.readObject();
      ois.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Unserialized Boolean from " + "boolean.ser");
    System.out.println("Boolean data: " + booleanData);
    System.out.println("Compare data with true: " + booleanData.equals(new Boolean("true")));
  }

  public static void main(String args[]) {
    UnserializeBoolean usb = new UnserializeBoolean();
  }
}
