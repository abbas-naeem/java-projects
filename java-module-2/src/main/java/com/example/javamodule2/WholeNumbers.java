package com.example.javamodule2;

public class WholeNumbers {
    public static void main(String[] args) {
        int numberOfFans = 5000;
        System.out.println("There are " + numberOfFans + " fans at the Quidditch game");

        //        int globalPopulation = 7000000000;
        //        System.out.println("There are " + globalPopulation + " people on earth");
        //        Number cannot be above 2 Billion instead use long

        long globalPopulation = 70000000L;
        System.out.println("There are " + globalPopulation + " people on Earth");
    }
}
