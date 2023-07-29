package ConditionalStatements;

import java.util.Scanner;

public class IfElseClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // adult or not
        // int age = in.nextInt();
        // if (age > 18) {
        // System.out.println("Your are adult");
        // } else {
        // System.out.println("Your are not adult");
        // }

        // even or odd
        // int num = in.nextInt();
        // if(num % 2 == 0) {
        // System.out.println("Even");
        // }
        // else {
        // System.out.println("Odd");
        // }

        // compare a and b
        // int a = in.nextInt();
        // int b = in.nextInt();
        // if (a == b) {
        // System.out.println("Equal");
        // } else if (a > b) {
        // System.out.println("A is greater");
        // } else {
        // System.out.println("B is greater");
        // }

        int btn = in.nextInt();
        if (btn == 1)
            System.out.println("Hello");
        else if (btn == 2)
            System.out.println("Namaste");
        else if (btn == 3)
            System.out.println("Bonour");
        else
            System.out.println("Invalid button");
    }
}
