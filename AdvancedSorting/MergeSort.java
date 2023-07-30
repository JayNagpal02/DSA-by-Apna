package AdvancedSorting;

import java.util.Arrays;

// Divide and Conquer
// time complexity => O(nlogn)
public class MergeSort {
    // O(n) time complexity
    public static void conquer(int arr[], int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int leftArrIndex = start;
        int rightArrIndex = mid + 1;
        int mergedArrIndex = 0;
        while (leftArrIndex <= mid && rightArrIndex <= end) {
            /**
             * for ascending => if (arr[leftArrIndex] <= arr[rightArrIndex])
             * and
             * for descending => if (arr[leftArrIndex] > arr[rightArrIndex])
             */
            if (arr[leftArrIndex] <= arr[rightArrIndex]) {
                merged[mergedArrIndex++] = arr[leftArrIndex++];
            } else {
                merged[mergedArrIndex++] = arr[rightArrIndex++];
            }
        }
        while (leftArrIndex <= mid) {
            merged[mergedArrIndex++] = arr[leftArrIndex++];
        }
        while (rightArrIndex <= end) {
            merged[mergedArrIndex++] = arr[rightArrIndex++];
        }
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // O(logn) time complexity
    public static void divide(int arr[], int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2; // mid = (start + end) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void mergeSort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
