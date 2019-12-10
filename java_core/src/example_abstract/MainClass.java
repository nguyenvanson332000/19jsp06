package example_abstract;

// Abstract class
abstract class Animal {
    // Abstract method (không có body)
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

// Class Pig thừa kế từ lớp Animal
class Pig extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Cat extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: meow meow");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal cat = new Cat();
        pig.animalSound();
        pig.sleep();
        cat.animalSound();
        cat.sleep();
    }
}
