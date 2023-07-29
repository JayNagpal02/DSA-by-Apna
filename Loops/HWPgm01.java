package Loops;

import java.util.Scanner;

// print all even numbers till n.
public class HWPgm01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 0; i <= num; i = i + 2) {
            System.out.println(i);
        }
    }
}
