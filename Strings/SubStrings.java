package Strings;

public class SubStrings {
    public static void main(String[] args) {
        String sentence = "My name is Jay Nagpal";
        String name = sentence.substring(11, 14);
        String fullName = sentence.substring(11);
        System.out.println(name);
        System.out.println(fullName);
    }
}
