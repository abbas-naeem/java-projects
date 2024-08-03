public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 8000, 2024, "grey");

        Car toyota = new Car("Toyota", 5000, 2019, "grey");

        bmw.setColor("Jet Black");
        toyota.setColor("Jet Black");

        toyota.setPrice(toyota.getPrice() / 2);
        bmw.setPrice(bmw.getPrice() / 2);

        System.out.println("This " + bmw.getMake() + " is worth £" + bmw.getPrice() +
                ". It was built in " + bmw.getYear() + ". It is " + bmw.getColor() + ".\n");
        System.out.println("This " + toyota.getMake() + " is worth $" + toyota.getPrice() +
                ". It was built in " + toyota.getYear() + ". It is " + toyota.getColor() + ".\n");

    }
}