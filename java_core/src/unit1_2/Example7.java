package unit1_2;

// Link: https://www.w3schools.com/java/java_strings.asp, https://www.w3schools.com/java/java_ref_string.asp
public class Example7 {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        // Dùng hàm length() in ra độ dài chuỗi
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt1.length());

        // chuyển 1 chuyển sang IN HOA hoặc in thường
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        // Tìm vị trí xuất hiện đầu tiên của một chuỗi trong chuổi khác
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        // Cộng 2 chuỗi
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName)); // Dùng hàm concat để cộng chuỗi, tương tự với phép +

        // Chuỗi chứa ký tự đặc biệt
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);
    }
}
