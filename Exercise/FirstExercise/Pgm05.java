package Exercise.FirstExercise;

import java.util.Scanner;

/**
 * Write a function that takes in age as input and returns if that person is
 * eligible to vote or not. A person of age > 18 is eligible to vote.
 */

public class Pgm05 {
    public static boolean isEligibleToVote(int age) {
        if (age > 18)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isEligibleToVote(age));
    }
}
