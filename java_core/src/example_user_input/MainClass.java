package example_user_input;

import java.util.Scanner;

// Link: https://www.w3schools.com/java/java_user_input.asp
public class MainClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        int age = myObj.nextInt();
        System.out.println("Age is: " + age);
        myObj.close();
    }
}
