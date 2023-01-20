package Chapter6a;

public class Insertion {
  public static void main(String args[]) {
    int arr[] = { 3, 2, 5, 1, 6 };

    System.out.println("Printing unsorted elements: ");
    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    System.out.println();

    // Performing insertion sort
    int startIndex = 1;
    int endIndex = arr.length;
    for (int i = startIndex; i < endIndex; i++) {
      int element = arr[i];
      int key = i - 1;

      // Check the key first.
      while (key >= 0 && element < arr[key]) {
        arr[key + 1] = arr[key];
        key--;
      }

      arr[key + 1] = element;
    }

    System.out.println("Printing sorted elements: ");
    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }
}