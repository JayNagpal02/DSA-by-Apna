package ArraysIntro;

import java.util.Scanner;

/**
 * Find the maximum & minimum number in an array of integers.
 */

public class HWPgm02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maximum)
                maximum = numbers[i];
            if (numbers[i] < minimum)
                minimum = numbers[i];
        }
        System.out.println("Maximum number is : " + maximum);
        System.out.println("Minimum number is : " + minimum);
    }
}
