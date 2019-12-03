package oop;

public class Cat extends Animal {
    private String color;

    public Cat(boolean vegetarian, int noOfLegs, String color) {
        super(vegetarian, noOfLegs);
        this.color = color;
    }

    public void meow() {
        System.out.println("Meowing...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
