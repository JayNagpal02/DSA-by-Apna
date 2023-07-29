package Exercise.FirstExercise;

import java.util.Scanner;

/**
 * Write a program to enter the numbers till the user wants and at the end it
 * should display the count of positive, negative and zeros entered.
 */

public class Pgm07 {
    public static void main(String[] args) {
        int onGoing = 0;
        int num = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number : ");
            num = sc.nextInt();
            if (num == 0) {
                zerosCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            System.out.print("Enter '1' to continue...");
            onGoing = sc.nextInt();
        } while (onGoing == 1);
        System.out.println("positiveCount : " + positiveCount);
        System.out.println("negativeCount : " + negativeCount);
        System.out.println("zerosCount : " + zerosCount);
    }
}
