package Patterns;

import java.util.Scanner;

public class Pgm09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter row : ");
        int row = in.nextInt();
        // System.out.print("enter col : ");
        // int col = in.nextInt();

        // outer loop
        for (int i = 0; i < row; i++) {
            // inner loop
            for (int j = 0; j < i + 1; j++) {
                // cell
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
