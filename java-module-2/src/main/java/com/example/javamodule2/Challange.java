package com.example.javamodule2;
import java.util.Scanner;

public class Challange {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello what is your name?");
        String name = scan.nextLine();

        System.out.println("\n Hi " + name + "! I'm Javabot. Where are you from?");
        String location = scan.nextLine();

        System.out.println("\n  I heard it's beautiful in " + location + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("\n So your " + age + ", cool! I'm 400 years old.");
        System.out.println("\n This means I am " + (400/age) + " times older than you.");

        System.out.println("Enough about me. What's your favourite programming language? (just don't say Scratch)");
        String favouriteLanguage = scan.nextLine();

        System.out.println("\n" + favouriteLanguage + " fair enough! How many years have you been coding in " + favouriteLanguage);
        int yearsInFavouriteLanguage = scan.nextInt();
        scan.nextLine();

        System.out.println("\n" + yearsInFavouriteLanguage + " years eh? That's great, keep it up!");
        System.out.println("Nice chatting with you " + name + ". I have to log off now. Peace out!");
    }

}
