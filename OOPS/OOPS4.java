package OOPS;

interface Animals {
    int eyes = 2;

    void walk();
}

interface Herbivore {

}

class Horse2 implements Animals, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class OOPS4 {
    public static void main(String[] args) {
        Horse2 horse = new Horse2();
        horse.walk();
    }
}
