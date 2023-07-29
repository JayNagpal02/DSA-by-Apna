package ArraysIntro;

import java.util.Scanner;

public class Pgm01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];
        // input
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
