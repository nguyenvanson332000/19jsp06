package example_array_list;

import java.util.ArrayList;
import java.util.Collections;

// Link: https://www.w3schools.com/java/java_arraylist.asp
public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        // for each
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println(cars.get(0));
        cars.set(0, "Opel");
        System.out.println(cars.get(0));

        // Sắp xếp mảng tăng dần
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
        // xóa tất cả phần tử trong array list
        cars.clear();
    }
}
