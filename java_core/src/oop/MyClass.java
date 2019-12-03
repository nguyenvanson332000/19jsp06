package oop;

public class MyClass {
    public static void main(String[] args) {
        Cat cat = new Cat(false, 4, "Black");
        System.out.println(cat.isVegetarian());
        System.out.println(cat.getNoOfLegs());
        System.out.println(cat.getColor());
        cat.eat();
        cat.meow();
    }
}
