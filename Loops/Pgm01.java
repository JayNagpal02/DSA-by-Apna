package Loops;

import java.util.Scanner;

// print the sum of first n natural numbers
public class Pgm01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
