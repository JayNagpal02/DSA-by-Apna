package Patterns;

import java.util.Scanner;

public class Pgm08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter row : ");
        int row = in.nextInt();
        // System.out.print("enter col : ");
        // int col = in.nextInt();
        int count = 1;

        // outer loop
        for (int i = 0; i < row; i++) {
            // inner loop
            for (int j = 0; j < i+1; j++) {
                // cell
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
