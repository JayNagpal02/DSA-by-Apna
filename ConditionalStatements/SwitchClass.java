package ConditionalStatements;

import java.util.*;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int btn = in.nextInt();

        switch (btn) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");
                break;
        }
    }
}
