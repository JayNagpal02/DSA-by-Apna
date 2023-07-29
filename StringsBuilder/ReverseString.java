package StringsBuilder;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        int size = sb.length();
        for (int i = 0; i < size / 2; i++) {
            // int front = i;
            // int back = sb.length() - i - 1;
            String a = "" + sb.charAt(i); // or char a = sb.charAt(i);
            String b = "" + sb.charAt(size - 1 - i); // or char b = sb.charAt(size - 1 - i);
            sb.replace(i, i + 1, b); // or sb.setCharAt(i, i + 1, b);
            sb.replace(size - 1 - i, size - i, a); // or sb.setCharAt(size - 1 - i, size - i, a);
        }
        System.out.println(sb);
    }
}
