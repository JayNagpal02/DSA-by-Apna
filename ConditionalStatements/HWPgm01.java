package ConditionalStatements;

import java.util.Scanner;

public class HWPgm01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("[ 1 => + , 2 => - , 3 => * , 4 => / , 5 => % ]");
        System.out.print("enter operation : ");
        int op = in.nextInt();

        switch (op) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0)
                    System.out.println("Invalid division");
                else
                    System.out.println(a / b);
                break;
            case 5:
                if (b == 0)
                    System.out.println("Invalid division");
                else
                    System.out.println(a % b);
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
    }
}
