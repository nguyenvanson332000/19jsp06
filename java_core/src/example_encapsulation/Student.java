package example_encapsulation;

public class Student {
    private String name; // length <= 10
    private float point; // 0 - 10

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 10){
            this.name = name;
        }else {
            System.out.println("Error: Lenght of name should be less than 10");
        }
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        if (point >= 0 && point <= 10) {
            this.point = point;
        } else {
            System.out.println("Error: Point should be between 0 and 10");
        }
    }
}
