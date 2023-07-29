package Loops;

import java.util.Scanner;

public class Pgm02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
