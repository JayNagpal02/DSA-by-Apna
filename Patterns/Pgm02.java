package Patterns;

import java.util.Scanner;

public class Pgm02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter row : ");
        int row = in.nextInt();
        System.out.print("enter col : ");
        int col = in.nextInt();

        // outer loop
        for (int i = 0; i < row; i++) {
            // inner loop
            for (int j = 0; j < col; j++) {
                // cell
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
