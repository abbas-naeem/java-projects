import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Player 1: Enter rock, paper, or scissors");
        String player1 = scan.nextLine();
        scan.close();
        String[] choices = {"rock", "paper", "scissors"};
        String player2 = choices[rand.nextInt(3)];
        rockPaperScissors(player1, player2);
    }

    public static void rockPaperScissors(String player1, String player2) {
        if(player1.equals(player2)) {
            System.out.println("You picked: " + player1);
            System.out.println("Player 2 picked: " + player2);
            System.out.println("It's a tie!");
        }

        else if(player1.equals("rock") && player2.equals("scissors")) {
            System.out.println("You picked: " + player1);
            System.out.println("Player 2 picked: " + player2);
            System.out.println("Player 1 Wins!");
        }

        else if(player1.equals("rock") && player2.equals("paper")) {
            System.out.println("You picked: " + player1);
            System.out.println("Player 2 picked: " + player2);
            System.out.println("Player 1 Wins!");
        }

        else if(player1.equals("paper") && player2.equals("scissors")) {
            System.out.println("You picked: " + player1);
            System.out.println("Player 2 picked: " + player2);
            System.out.println("Player 2 Wins!");
        }

        else if(player1.equals("paper") && player2.equals("rock")) {
            System.out.println("You picked: " + player1);
            System.out.println("Player 2 picked: " + player2);
            System.out.println("Player 1 Wins!");
        }

        else if(player1.equals("scissors") && player2.equals("rock")) {
            System.out.println("You picked: " + player1);
            System.out.println("Player 2 picked: " + player2);
            System.out.println("Player 2 Wins!");
        }

        else if(player1.equals("scissors") && player2.equals("paper")) {
            System.out.println("You picked: " + player1);
            System.out.println("Player 2 picked: " + player2);
            System.out.println("Player 1 Wins!");
        } else {
            System.out.println("Invalid input. Please enter rock, paper, or scissors.");
        }

        }



    }
