package example_inheritance;

public class Animal {
    private boolean vegetarian;

    private int noOfLegs;

    public Animal() {

    }

    public Animal(boolean vegetarian, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.noOfLegs = noOfLegs;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
