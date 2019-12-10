package example_package;

import java.util.Scanner;

// Link: https://www.w3schools.com/java/java_packages.asp
public class MainClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
