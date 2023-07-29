package ArraysIntro;

import java.util.Scanner;

/**
 * Take an array of names as input from the user and print them on the screen.
 */

public class HWPgm01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] names = new String[size];

        // input
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }

        // output
        for (int i = 0; i < names.length; i++) {
            // System.out.print(names[i] + " ");
            System.out.println("name " + (i + 1) + " is : " + names[i]);
        }
    }
}
