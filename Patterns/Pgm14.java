package Patterns;

import java.util.Scanner;

public class Pgm14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = in.nextInt();

        // upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            int len = (2 * i) - 1;
            // stars
            for (int j = 1; j <= len; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = n; i > 0; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            int len = (2 * i) - 1;
            // stars
            for (int j = 1; j <= len; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
