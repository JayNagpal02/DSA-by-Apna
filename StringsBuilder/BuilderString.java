package StringsBuilder;

public class BuilderString {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Jay");
        // System.out.println(sb);

        // char at index 0
        // System.out.println(sb.charAt(0));

        // set char at index
        // sb.setCharAt(2, 'i');
        // System.out.println(sb);

        // sb.insert(2, "a");
        // System.out.println(sb);

        // sb.delete(1,3);
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        // length
        System.out.println(sb.length());
    }
}
