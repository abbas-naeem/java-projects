import java.util.Arrays;
import java.util.Scanner;

public class fibocannisqnce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Fibonacci Sequence Java Utility");

        System.out.print("Please print your first number: ");
        int firstNumber = scan.nextInt();
        scan.nextLine();

        System.out.print("Please print your second number: ");
        int secondNumber = scan.nextInt();

        System.out.print("Please big do you want your sequence to be: ");
        int sequenceSize = scan.nextInt();

        int[] sequence = new int[sequenceSize];

        sequence[0] = firstNumber;

        sequence[1] = secondNumber;

        for (int i = 2; i < sequenceSize; i++) {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }

        System.out.println(Arrays.toString(sequence));

    }

}
