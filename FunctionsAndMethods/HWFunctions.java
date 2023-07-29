package FunctionsAndMethods;

import java.util.Scanner;

/**
 * Make a function to check if a number is prime or not.
 * Make a function to check if a given number n is even or not.
 * Make a function to print the table of a given number n.
 */

public class HWFunctions {
    public static void isPrimeFun(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            if (num == 1) {
                System.out.println(num + " is neither a prime number nor composite number");
            } else {
                System.out.println(num + " is a prime number");
            }
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        isPrimeFun(num);
        isEven(num);
        printTable(num);
    }
}
