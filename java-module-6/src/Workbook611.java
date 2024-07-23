import java.util.Arrays;

public class Workbook611 {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17, 21, 23, 18.5, 20};
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (celsius[i] * 1.8) + 32;
        }

        System.out.println("Celsius: " + Arrays.toString(celsius));
        System.out.println("Fahrenheit: " + Arrays.toString(fahrenheit));
    }
}
