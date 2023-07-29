package Patterns;

import java.util.Scanner;

public class Pgm10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = in.nextInt();

        // upper half
        for (int i = 0; i < n; i++) {
            // ist part
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // int len = (((n - 1) * 2) - ((i * 2) + 1));
            int len = 2 * (n - (i + 1));
            // spaces
            for (int j = 0; j < len; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i > 0; i--) {
            // ist part
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            int len = 2 * (n - i);
            // spaces
            for (int j = 0; j < len; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
