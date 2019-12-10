package example_encapsulation;

// Link: https://www.w3schools.com/java/java_encapsulation.asp
public class MainClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.setPoint(-1);
        System.out.println(student.getPoint());
        student.setName("Phuc");
        System.out.println(student.getName());
    }
}
