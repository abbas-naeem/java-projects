public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 8000, 2024, "grey");

        Car toyota = new Car("Toyota", 5000, 2019, "grey");

        System.out.println("This " + bmw.make + " is worth £" + bmw.price +
                ". It was built in " + bmw.year + ". It is " + bmw.color + ".\n");
        System.out.println("This " + toyota.make + " is worth $" + toyota.price +
                ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");

    }
}