import java.util.Arrays;
import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Second Number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Third Number: ");
        int thirdNumber = scan.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First is the biggest");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second is the biggest");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Third is the biggest");
        } else if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) {
            System.out.println("Some numbers are the same");
        }
    }
}
