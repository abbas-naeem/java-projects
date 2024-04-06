import java.util.Scanner;

public class Workbook53 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Timmy! Choose a number to count to: ");
        int number = scan.nextInt();
        System.out.println("Great! Here is how it is done: ");
        for (int i = 0; i <= number; i++) {
            System.out.println(i + " ");
        }
    }

}
