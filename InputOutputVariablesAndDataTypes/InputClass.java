package InputOutputVariablesAndDataTypes;

import java.util.Scanner;

public class InputClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // next()
        // nestInt()
        // nextFloat()
        // nextDouble()
        // nextLong()
        // System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
