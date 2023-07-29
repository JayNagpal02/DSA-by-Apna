package ArraysIntro;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Take an array of numbers as input and check if it is an array sorted in
 * ascending order.
 * Eg : { 1, 2, 4, 7 } is sorted in ascending order.
 * {3, 4, 6, 2} is not sorted in ascending order.
 */

public class HWPgm03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean isAscending = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println(Arrays.toString(numbers) + " is sorted in ascending order.");
        } else {
            System.out.println(Arrays.toString(numbers) + " is not sorted in ascending order.");
        }
    }
}
