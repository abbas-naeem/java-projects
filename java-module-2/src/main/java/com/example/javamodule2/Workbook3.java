package com.example.javamodule2;
import java.util.Scanner;

public class Workbook3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        scan.nextLine(); // Whenever there is an int or something else always use nextline so it dosen't skip the next object

        System.out.println("Make a username: ");
        String username = scan.nextLine();

        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();

        System.out.println("\nWhat country do you live in?");
        String country = scan.nextLine();

        System.out.println("Thank you for joining this service!");

        System.out.println("\nHere is the information that you entered: ");
        System.out.println("        First Name: " + firstName);
        System.out.println("        Last Name: " + lastName);
        System.out.println("        Age: " + age);
        System.out.println("        Username: " + username);
        System.out.println("        City: " + city);
        System.out.println("        Country: " + country);
    }
}
