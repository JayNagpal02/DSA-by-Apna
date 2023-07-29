package Sorting;

import java.util.Arrays;

/**
 * time complexity => O(n^2)
 */
public class BubbleSort {
    private static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }

    public static void ascendingBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // n-1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void descendingBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        System.out.println("Before Bubble Sort : " + Arrays.toString(arr));
        ascendingBubbleSort(arr);
        System.out.println("Ascending Bubble Sort : " + Arrays.toString(arr));
        descendingBubbleSort(arr);
        System.out.println("Descending Bubble Sort : " + Arrays.toString(arr));
    }
}