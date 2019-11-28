package unit1_2;

// Link: https://www.w3schools.com/java/java_arrays.asp
public class Example15 {
    public static void main(String[] args) {
        // Khai báo mảng
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // In ra độ dài của mảng
        System.out.println(cars.length);
        // Duyệt các phần tử của mảng
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // Duyệt các phần tử của mảng thông qua for-each
        for (String i : cars) {
            System.out.println(i);
        }

        // Mảng nhiều chiều
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x);
    }
}
