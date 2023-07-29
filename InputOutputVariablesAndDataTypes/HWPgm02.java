package InputOutputVariablesAndDataTypes;

import java.util.Scanner;

public class HWPgm02 {
    public static void main(String[] args) {
        System.out.print("enter radius : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = 3.14 *(radius * radius);
        System.out.println(area);
    }
}
