package Sorting;

import java.util.Arrays;

/**
 * time complexity => O(n^2)
 */
public class InsertionSort {
    public static void ascendingInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;
        }
    }

    public static void descendingInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        System.out.println("Before Insertion Sort : " + Arrays.toString(arr));
        ascendingInsertionSort(arr);
        System.out.println("Ascending Insertion Sort : " + Arrays.toString(arr));
        descendingInsertionSort(arr);
        System.out.println("Descending Insertion Sort : " + Arrays.toString(arr));
    }
}