package Exercise.FirstExercise;

/**
 * Two numbers are entered by the user, x and n. Write a function to find the
 * value of one number raised to the power of another i.e. x^n.
 */

public class Pgm08 {
    public static int power(int x, int n) {
        int pwr = 1;
        for (int i = 0; i < n; i++) {
            pwr = pwr * x;
        }
        return pwr;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 2;
        System.out.println(power(x, n));
    }
}
