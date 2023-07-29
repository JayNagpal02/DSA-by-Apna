package Patterns;

import java.util.Scanner;

public class Pgm07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter row : ");
        int row = in.nextInt();
        // System.out.print("enter col : ");
        // int col = in.nextInt();

        // outer loop
        for (int i = row; i > 0; i--) {
            // inner loop
            for (int j = 0; j < i; j++) {
                // cell
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }
}
