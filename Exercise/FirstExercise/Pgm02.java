package Exercise.FirstExercise;

import java.util.Scanner;

/**
 * Write a function to print the sum of all odd numbers from 1 to n.
 */

public class Pgm02 {
    public static void sumOfOddNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i += 2) {
            sum += i;
        }
        System.out.println("Sum Of Odd Numbers till " + num + " is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOfOddNumbers(num);
    }
}
