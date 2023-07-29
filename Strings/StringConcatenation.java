package Strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "jay";
        String lastName = "nagpal";
        String fullName = firstName + "_" + lastName;
        System.out.println(fullName);

        // length of the string
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();

        // compare
        String name1 = "Jay";
        String name2 = "Jay";

        // 1. s1 > s2 : +ve value
        // 2. s1 < s2 : -ve value
        // 3. s1 == s2 : 0

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("equal");
        // } else {
        // System.out.println("not equal");
        // }

        if (name1 == name2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if (new String("jay") == new String("jay")) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
