package Chapter4a;

import java.lang.Runtime;
import java.lang.Process;

public class RuntimeDemo {
  public static void main(String args[]) {
    Runtime rt = Runtime.getRuntime();
    Process proc;
    try {
      proc = rt.exec("regedit");
      proc.waitFor();
    } catch(Exception e) {
      System.out.println("regedit is an unknown command.");
    }
  }
}
