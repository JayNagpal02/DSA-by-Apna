package Recursion;

public class Recursion1 {
    // print number from 5 to 1
    // public static void printNumber(int n) {
    // if (n == 0)
    // return;
    // System.out.print(n + " ");
    // printNumber(n - 1);
    // }

    // print number from 1 to 5
    // my method
    public static void printNumber(int n) {
        if (n == 0)
            return;
        printNumber(n - 1);
        System.out.print(n + " ");
    }

    // print sum of n natural numbers
    // my method
    public static int calculateSum(int n) {
        if (n == 0)
            return 0;
        int sum = 0;
        sum = n + calculateSum(n - 1);
        return sum;
    }

    // video method
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    // print factorial of a number n
    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        int fact = 0;
        fact = n * calculateFactorial(n - 1);
        return fact;
    }

    // print thr fibonacci sequence till nth term
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0)
            return;
        int x = a + b;
        System.out.print(x + " ");
        printFibonacci(b, x, n - 1);
    }

    // print x^n (stack height = n)
    // my method
    public static int calculatePower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        int sum = 0;
        if (n == 1) {
            sum = x * 1;
        } else {
            sum = x * calculatePower(x, n - 1);
        }
        return sum;
    }

    // print x^n (stack height = log(n))
    public static int calculatePowerLog(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {// if n is even
            return calculatePowerLog(x, n / 2) * calculatePowerLog(x, n / 2);
        } else { // if n is odd
            return calculatePowerLog(x, n / 2) * calculatePowerLog(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int n = 7, a = 0, b = 1, x = 2;
        // printNumber(n);
        // System.out.println(calculateSum(n));
        // printSum(1, 5, 0);
        // System.out.println(calculateFactorial(n));
        System.out.print(a + " ");
        System.out.print(b + " ");
        printFibonacci(a, b, n - 2);
        System.out.println();
        System.out.println(calculatePower(x, n));
        System.out.println(calculatePowerLog(x, n));
    }
}
