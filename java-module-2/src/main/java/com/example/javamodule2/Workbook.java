package com.example.javamodule2;

public class Workbook {

    public static void main(String[] args) {

        double costOfOneContract = 44.8;
        int amountOfContractsSold = 2;
        int goodRatings = 3;
        int amountOfContractsLeft = 4;

        System.out.println("Wow! So far, you made: " + (costOfOneContract * amountOfContractsSold));
        System.out.println(goodRatings + "customers are satisfied with your contracts");
        System.out.println("You have " + amountOfContractsLeft + " contracts left. We will sell more later!");
    }
}
