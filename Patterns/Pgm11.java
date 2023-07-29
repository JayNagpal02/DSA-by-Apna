package Patterns;

import java.util.Scanner;

public class Pgm11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
