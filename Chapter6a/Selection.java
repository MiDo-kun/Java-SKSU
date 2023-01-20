package Chapter6a;

public class Selection {
  public static void main(String args[]) {
    int arr[] = { 3, 2, 5, 1, 6 };

    System.out.println("Printing unsorted elements: ");
    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    System.out.println();

    for (int i = 0; i < (arr.length - 1); i++) {
      int smallest = arr[i];
      int index = i;
      for (int j = i + 1; j < arr.length; j++) {
        int secondElement = arr[j];
        if (secondElement < smallest) {
          smallest = secondElement;
          index = j;
        }
      }

      // Swap elements
      int temp = arr[i];
      arr[i] = smallest;
      arr[index] = temp;
    }

    System.out.println("Printing sorted elements: ");
    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }
}