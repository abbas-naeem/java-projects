import java.util.Scanner;

public class Workbook610 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] toppings = new String[5];

        for (int i = 0; i < toppings.length; i++) {
            System.out.print(i + ". ");
            String current = scan.nextLine();
            toppings[i] = current;
        }
    }
}
