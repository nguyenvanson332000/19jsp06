package unit1_2;

// Link: https://www.w3schools.com/java/java_conditions.asp
public class Example10 {
    public static void main(String[] args) {
        int x = 10;
        // Kiểm tra x là số chẵn hay lẽ
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        int time1 = 22;
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
