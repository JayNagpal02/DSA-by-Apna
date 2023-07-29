package Patterns;

import java.util.Scanner;

public class Pgm13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // numbers => n to 1
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            // numbers => 2 to n
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
