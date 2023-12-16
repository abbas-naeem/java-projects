package com.example.javamodule2;

public class Workbook2 {

    public static void main(String[] args) {
        double amountMade = 24309.5555555;
        double amountSpent = 5747.3333333;
        double refunds = 688.455;
        double shippingCosts = 1233.334;

        System.out.println("This month, we made $" + (int)amountMade + " in profit");
        System.out.println("Factoring in costs, we made $" + (int)(amountMade-amountSpent) + " in profit");
        System.out.println("The refunds are at a low $" + (int)refunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + (int)shippingCosts + " in shipping");

    }

}
