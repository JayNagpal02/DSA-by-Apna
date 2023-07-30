package OOPS;

// import OOPS.Bank.*;

// it is called as parent or base class
class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

// it is called as child or sub or derived class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class OOPS2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(5, 5);
    }
}
