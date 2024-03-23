public class Workbook43 {
    public static void main(String[] args) {
        conversionFromFahrenheit(77);
    }

    public static void conversionFromFahrenheit(double temperature) {
        double finalAnswer = (temperature - 32) * 5 / 9;
        System.out.println(finalAnswer);
    }
}