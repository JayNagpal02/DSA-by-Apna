package ArraysIntro;

public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3]; // or int marks[] = new int[3];
        // marks[0] = 97; // phy
        // marks[1] = 92; // eng
        // marks[2] = 95; // chem
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        int[] marks = { 97, 92, 95 };
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
