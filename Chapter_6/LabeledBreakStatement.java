package Chapter_6;

public class LabeledBreakStatement {
  public static void main(String[] args) {
    int numbers[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int searchNum = 5;
    boolean foundNum = false;

    // If break statement has been called, then this block would stop.
    searchLabel:
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if (numbers[i][j] == searchNum) {
          foundNum = true;
          break searchLabel;
        }
      }
    }

    if (foundNum) {
      System.out.println(searchNum + " was found!");
    } else {
      System.out.println(searchNum + " was not found!");
    }
  }
}