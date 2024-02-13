public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.5, 3.5);
        calculateArea(2, 3);
        calculateArea(10, 100);
    }

    public static void calculateArea(double length, double width) {
        System.out.println("Area: " + length * width);
    }
}
