package Random;

import java.util.Arrays;
import Sorting.BubbleSort;
import Sorting.SelectionSort;

public class Random {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 7, 6, 4, 2 };
        System.out.println(Arrays.toString(arr));
        BubbleSort.ascendingBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        SelectionSort.descendingSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
