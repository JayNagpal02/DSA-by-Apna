package OOPS;

class Pen {
    // properties or data
    String color;
    String type; // ballpoint, gel

    // methods
    public void write() {
        System.out.println("writing something...");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    /**
     * constructor are special methods
     * they are only declared inside a class
     * they are only called once when the object of that class is being created
     * constructor methods must have same name as that of the class
     * constructor methods do not have any return type not even void
     * there are multiple types of constructor methods
     * if we don't create a constructor method then java provides its own default
     * constructor method
     * we can have more than one constructor method in the class depending on the
     * input arguments
     * copy constructor methods
     */
    // no parameterized constructor
    Student() {
        System.out.println("constructor called");
    }

    // parameterized constructor
    Student(String name, int age) {
        /**
         * here this.name is the name of the class
         * and
         * name is the name input of the constructor method provide by the object
         */
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    /**
     * this is called function / method overloading
     * it means
     * nam ek kam anek
     * one name multiple work
     * 
     * all the methods must have some differentiating factor from each other
     * either they can have different types of input arguments
     * or they can have different return type
     * or they can have different number of input arguments
     */
    public void printInfo(String name, int age) {
        System.out.println(this.name + " " + this.age);
    }

    public void printInfo(String name) {
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS1 {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

        Student s1 = new Student();
        s1.name = "jay";
        s1.age = 22;
        s1.printInfo();

        Student s2 = new Student("vivek", 22);
        s2.printInfo(s2.name);

        Student s3 = new Student(s2);
        s3.printInfo(s3.name, s3.age);
    }
}
