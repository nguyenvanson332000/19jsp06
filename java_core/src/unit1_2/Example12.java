package unit1_2;

//Link: https://www.w3schools.com/java/java_while_loop.asp
public class Example12 {
    public static void main(String[] args) {
        int i1 = 0;
        while (i1 < 5) {
            System.out.println(i1);
            i1++;
        }

        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        }
        while (i2 < 5);
    }
}
