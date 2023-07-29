package Exercise.FirstExercise;

/**
 * Write a function that calculates the Greatest Common Divisor of 2 numbers.
 */

public class Pgm09 {
    public static int[] divisor(int x) {
        int[] arr = new int[x / 2];
        int counter = 0;
        int count = 0;
        for (int i = 1; i < x / 2; i++) {
            if (x % i == 0) {
                arr[counter++] = i;
            }
        }
        arr[counter++] = x;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        int arr2[] = new int[count];
        for (int i = 0; i < count; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static int gcd(int x, int y) {
        int[] arrX = divisor(x);
        int[] arrY = divisor(y);
        int[] arr;
        int n = arrX.length;
        int m = arrY.length;
        int counter = 0;
        if (n > m) {
            arr = new int[n];
        } else {
            arr = new int[m];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arrX[i] == arrY[j]) {
                    arr[counter++] = arrX[i];
                }
            }
        }
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void gcd2(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " + n2);
    }

    public static void main(String[] args) {
        System.out.println(gcd(15, 70));
        gcd2(15, 70);
    }
}
