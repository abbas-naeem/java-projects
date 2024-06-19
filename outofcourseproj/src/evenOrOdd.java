import java.util.Scanner;

public class evenOrOdd {

    public static void main(String[] args) {
        while (2 > 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any number: ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("The number you have wrote it even");
            } else {
                System.out.println("The number you have wrote is odd");
            }
        }

    }
}
