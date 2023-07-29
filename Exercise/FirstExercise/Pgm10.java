package Exercise.FirstExercise;

/**
 * Write a program to print Fibonacci series of n terms where n is input by user
 * :
 * 0 1 1 2 3 5 8 13 21 .....
 * In the Fibonacci series, a number is the sum of the previous 2 numbers that
 * came before it.
 */

public class Pgm10 {
    public static void fibonacci(int num) {
        if (num == 1) {
            System.out.print("0 ");
            System.out.print("1 ");
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
            System.out.print("1 ");
            System.out.print("1 ");
            int a = 1;
            int b = 1;
            for (int i = 1; i < num; i++) {
                int x = a + b;
                System.out.print(x + " ");
                a = b;
                b = x;
            }
        }
    }

    public static void main(String[] args) {
        int num = 8;
        fibonacci(num);
    }
}
