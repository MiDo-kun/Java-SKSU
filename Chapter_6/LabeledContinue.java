package Chapter_6;

public class LabeledContinue {
  public static void main(String[] args) {
    outerLoop: 
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("Inside for(j) loop: " + j); // message1
        if (j == 2) continue outerLoop; // Just reference to the label
      }
      // if j == 2 then the below this block would not get called or executed due to the fact that the continue is labeled.
      // Try to use unlabled continue to execute below this statement.
      System.out.println("Inside for(i) loop: " + i); // message2
    }
  }
}