package OOPS;

class Student2 {
    String name;
    static String school;

    public static void changeSchool() {
        school = "CHM";
    }
}

public class OOPS5 {
    public static void main(String[] args) {
        Student2.school = "NCT";
        Student2 student1 = new Student2();
        student1.name = "tony";
        System.out.println(Student2.school);
        Student2.changeSchool();
        System.out.println(student1.school);
    }
}
