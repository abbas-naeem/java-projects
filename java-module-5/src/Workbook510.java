import java.util.Scanner;

public class Workbook510 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Dice 1: ");
            int dice1 = scan.nextInt();
            System.out.println("Dice 2: ");
            int dice2 = scan.nextInt();
            if (dice1 == dice2) {
                System.out.println("You rolled a double!");
                break;
            } else {
                System.out.println("You did not roll a double, please try again!");
            }
        }
    }

}
