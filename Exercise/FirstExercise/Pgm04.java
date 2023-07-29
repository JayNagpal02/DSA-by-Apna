package Exercise.FirstExercise;

import java.util.Scanner;

/**
 * Write a function that takes in the radius as input and returns the
 * circumference of a circle.
 */

public class Pgm04 {
    public static double calculateCircumference(double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("Circumference of radius " + radius + " is : " + calculateCircumference(radius));
    }
}
