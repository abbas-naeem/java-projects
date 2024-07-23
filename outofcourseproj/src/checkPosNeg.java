import java.util.Scanner;

public class checkPosNeg {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please write a number: ");
            int num = scan.nextInt();
            if (num > 0) {
                System.out.println("Your number is positive");
            } else if (num < 0) {
                System.out.println("Your number is negative");
            } else if (num == 0) {
                System.out.println("Your number is zero");
            }
        }
    }
}

