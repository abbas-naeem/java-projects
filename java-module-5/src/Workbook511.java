import java.util.Scanner;

public class Workbook511 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play a rolling game.");
        System.out.println("");
        System.out.println("Great, here are the rules: ");
        System.out.println("");
        System.out.println(" - If you roll a 6 the game stops");
        System.out.println(" - If you roll a 4 nothing happens");
        System.out.println(" - Otherwise, you get one point");
        System.out.println("");
        int totalScore = 0;

        while (true) {
            int randomNumber = Workbook58.generateRandomNumber(6);
            if (randomNumber == 1 || randomNumber == 2 || randomNumber == 3 || randomNumber == 5) {
                System.out.println("You rolled a " + randomNumber + "! You get one point!");
                totalScore++;
            } else if (randomNumber == 4) {
                System.out.println("You rolled a 4! Nothing happens.");
            }  else if (randomNumber == 6) {
                System.out.println("You rolled a 6! Thank you for playing!");
                if (totalScore >= 3) {
                    System.out.println("Congrats! You scored " + totalScore + " points!");
                    break;
                } else {
                    System.out.println("You scored " + totalScore + " points. Better luck next time!");
                    break;
                }

            }

        }
    }

}
