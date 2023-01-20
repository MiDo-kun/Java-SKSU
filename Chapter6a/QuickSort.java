package Chapter6a;

import java.util.Random;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 5, 1, 6 };

    System.out.println("Printing unsorted elements: ");
    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    System.out.println();

    quickSort(arr, 0, arr.length - 1);

    System.out.println("Printing unsorted elements: ");
    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(arr, low, high);
      quickSort(arr, low, pivotIndex);
      quickSort(arr, pivotIndex + 1, high);
    }
  }

  public static int partition(int[] arr, int low, int high) {
    Random rand = new Random();
    int pivotIndex = low + rand.nextInt(high - low);
    int pivot = arr[pivotIndex];
    swap(arr, pivotIndex, high);
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return i + 1;
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}