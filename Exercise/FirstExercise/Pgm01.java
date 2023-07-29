package Exercise.FirstExercise;

import java.util.Scanner;

/**
 * Enter 3 numbers from the user & make a function to print their average.
 */

public class Pgm01 {
    public static void calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = sum / (double) numbers.length;
        System.out.println("Average is : " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        calculateAverage(numbers);
    }
}
