package OOPS;

abstract class Animal {
    Animal() {
        System.out.println("You are creating a new Animal");
    }

    abstract void walk();

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a new Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class OOPS3 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        /**
         * Animal animal = new Animal();
         * animal.walk();
         * this will create a run time exception :
         * java.lang.Error: Unresolved compilation problem:
         * Cannot instantiate the type Animal
         * 
         */
        
    }
}
