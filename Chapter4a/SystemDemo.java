package Chapter4a;

import java.io.*;

public class SystemDemo {
  public static void main(String args[]) throws IOException {
    int arr1[] = new int[1050000];
    int arr2[] = new int[1050000];
    long startTime, endTime;

    // Initialize arr1
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = i + 1;
    }

    // Copying manually
    startTime = System.currentTimeMillis();
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i];
    }

    endTime = System.currentTimeMillis();
    System.out.println("Time for manual copy: " + (endTime - startTime + " ms."));

    startTime = System.currentTimeMillis();
    System.arraycopy(arr1, 0, arr2, 0, arr1.length);
    endTime = System.currentTimeMillis();
    
    System.out.println("Time for manual copy: " + (endTime - startTime) + " ms.");
    System.gc();

    System.setIn(new FileInputStream("/home/mido/Desktop/Java/Object_Oriented_Programming-Java/src/main/java/Chapter_4a/temp.txt"));
    System.exit(0);
  }
}