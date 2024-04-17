import java.util.Scanner;

public class Workbook55 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("I hear you like to count by threes");
        System.out.println("Jimmy: It depends");
        System.out.println("Oh ok...");
        System.out.println("");

        System.out.println("Pick a number to count by: ");
        int number = scan.nextInt();

        System.out.println("Pick a number to start counting from: ");
        int start = scan.nextInt();

        System.out.println("Pick a number to count to: ");
        int end = scan.nextInt();

        for (int start_for = start; start_for <= end; start_for += number) {
            System.out.println(start_for);
        }

    }


}
