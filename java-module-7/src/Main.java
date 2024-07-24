public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.make = "BMW";
        bmw.price = 8000;
        bmw.year = 2024;
        bmw.color = "grey";

        Car toyota = new Car();
        toyota.make = "Toyota";
        toyota.price = 5000;
        toyota.year = 2019;
        toyota.color = "grey";

        System.out.println("This " + bmw.make + " is worth £" + bmw.price +
                ". It was built in " + bmw.year + ". It is " + bmw.color + ".\n");
        System.out.println("This " + toyota.make + " is worth $" + toyota.price +
                ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");

    }
}