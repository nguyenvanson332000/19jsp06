package example_inheritance;

// Link: https://www.w3schools.com/java/java_inheritance.asp
public class MainClass {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.university);

        Cat cat = new Cat(true, 4, "Black");
        cat.eat();
        cat.meow();

    }
}
