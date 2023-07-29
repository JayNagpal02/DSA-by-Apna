package ArraysIntro;

import java.util.Scanner;

public class Pgm02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Target found at index " + numbers[i]);
            }
        }
    }
}
