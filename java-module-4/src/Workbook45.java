public class Workbook45 {
    public static void main(String[] args) {
        calculateSquareArea(5);
        calculateRectangleArea(5, 10);
        calculateTriangleArea(5, 10);
        calculateCircleArea(5);
    }

    public static void calculateSquareArea(double side) {
        System.out.println("Area of the square: " + side * side);
    }

    public static void calculateRectangleArea(double length, double width) {
        System.out.println("Area of the rectangle: " + length * width);
    }

    public static void calculateTriangleArea(double base, double height) {
        System.out.println("Area of the triangle: " + 0.5 * base * height);
    }

    public static void calculateCircleArea(double radius) {
        System.out.println("Area of the circle: " + Math.PI * radius * radius);
    }
}
