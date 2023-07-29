package Loops;

import java.util.Scanner;

public class HWPgm03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        do {
            System.out.print("enter marks : ");
            int marks = in.nextInt();
            if (marks > 100 || marks < 0)
                System.out.println("invalid marks");
            else if (marks >= 90)
                System.out.println("This is Good");
            else if (marks >= 60)
                System.out.println("This is also Good");
            else
                System.out.println("This is Good as well");
            System.out.print("Want to continue ? (yes(1) or no(0)) : ");
            num = in.nextInt();
        } while (num != 0);
    }
}
