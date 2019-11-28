package unit1_2;

// Link: https://www.w3schools.com/java/java_methods_param.asp
public class Example17 {

    static void printHello(String name) {
        System.out.println("Hello " + name);
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    // Đếm số lẻ trong 1 mảng
    static int countOdd(int[] arr) {
        // Khởi tạo giá trị đếm ban đầu = 0
        int count = 0;

        // Duyệt mảng arr
        for (int a : arr) {
            // Kiểm tra số lẻ
            if (a % 2 == 1) {
                count++; // tăng biến đếm lên 1
            }
        }

        return count;
    }

    public static void main(String[] args) {
        printHello("Liam");
        printHello("Jenny");
        System.out.println(sum(1, 2));
        checkAge(20);
        int[] arr = {1, 2, 3, 4, 7, 9};
        int count = countOdd(arr);
        System.out.println("Co " + count + " số lẻ trong mảng");
    }
}
