package unit1_2;

// Link: https://www.w3schools.com/java/java_data_types.asp
public class Example4 {
    public static void main(String[] args) {
        byte b = 127; // Kiểu byte có kích thước 1 bytes từ -128 -> 127
        System.out.println(b);
        System.out.println(Byte.MIN_VALUE); // Lấy giá trị nhỏ nhất của kiểu byte
        System.out.println(Byte.MAX_VALUE); // Lấy giá trị lớn nhất của kiểu byte
        short s = 1000;
        System.out.println(s);
        int i = 23_313_131; // hoặc int i = 23313131
        System.out.println(i);
        long l = 2_129_839_813L;
        System.out.println(l);
        float f = 1.344f;
        System.out.println(f);
        double d = 1213.313452d;
        System.out.println(d);
        boolean bl = true;
        System.out.println(bl);
        char c = 'D';
        System.out.println(c);
        String st = "Hello";
        System.out.println(st);
    }
}
