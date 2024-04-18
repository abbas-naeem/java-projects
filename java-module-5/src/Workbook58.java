import java.util.Scanner;

public class Workbook58 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guessedNumber = generateRandomNumber(5);
        System.out.println("I have chosen a number between 1 and 5. Try to guess it!");
        int userGuess = 0;
        while (userGuess != guessedNumber) {
            System.out.println("Enter your guess: ");
            userGuess = scan.nextInt();
            if (userGuess != guessedNumber) {
                System.out.println("Wrong! Try again!");
            } else {
                System.out.println("Correct! The number was " + guessedNumber);
            }
        }

    }

    public static int generateRandomNumber(int max) {
        return (int) (Math.random() * max) + 1;
    }
    }
