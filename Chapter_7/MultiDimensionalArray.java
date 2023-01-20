package Chapter_7;

public class MultiDimensionalArray {
  public static void main(String[] args) {
    int[][] twoD = new int[512][128]; // Integer array 512 x 128 elements.
    char[][][] threeD = new char[8][16][24]; // Character array 8 x 16 x 24

    // String array 4 rows x 2 columns
    String[][] dogs = { { "terry", "brown" }, 
        { "Kristin", "White" },
        { "Toby", "Gray" },
        { "Fido", "Black" } };

    for (int cols = 0; cols < 2; cols++) {
      for (int rows = 0; rows < dogs.length; rows++) {
        System.out.print("\t" + dogs[rows][cols]);
      }
      System.out.println();
    }
  }
}