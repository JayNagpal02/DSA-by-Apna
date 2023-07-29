package FunctionsAndMethods;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // printMyName(name); // call to function

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calculateSum(a, b);
        // System.out.println("Sum of 2 numbers is : " + sum);

        // System.out.println(calculateProduct(a, b));

        int num = sc.nextInt();
        printFactorial(num);
    }

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("invalid number");
            return;
        }
        // loop
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }
}
