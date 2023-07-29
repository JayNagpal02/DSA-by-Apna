package Sorting;

import java.util.Arrays;

/**
 * time complexity => O(n^2)
 */
public class SelectionSort {
    private static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }

    public static void ascendingSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            swap(arr, i, smallest);
        }
    }

    public static void descendingSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int largest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[largest] < arr[j]) {
                    largest = j;
                }
            }
            swap(arr, i, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        System.out.println("Before Selection Sort : " + Arrays.toString(arr));
        ascendingSelectionSort(arr);
        System.out.println("Ascending Selection Sort : " + Arrays.toString(arr));
        descendingSelectionSort(arr);
        System.out.println("Descending Selection Sort : " + Arrays.toString(arr));
    }
}
