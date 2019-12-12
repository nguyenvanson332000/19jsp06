package example_interface;

public interface Animal {
    void animalSound();
    void sleep();
}

class Pig implements Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}