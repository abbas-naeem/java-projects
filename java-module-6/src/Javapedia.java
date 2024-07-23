import java.util.Arrays;
import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("**********Javapedia**********");
        System.out.print("How many historical figures will you register?: ");
        int amount = scan.nextInt();
        scan.nextLine();
        String[][] data = new String[amount][3];
        for (int i = 0; i < amount; i++) {
            System.out.println("Figure: " + (i + 1));

            System.out.print(" - Name: ");
            String name = scan.nextLine();
            data[i][0] = name;

            System.out.print(" - Date of birth: ");
            String dob = scan.nextLine();
            data[i][1] = dob;

            System.out.print(" - Occupation: ");
            String occupation = scan.nextLine();
            data[i][2] = occupation;

            System.out.println(" ");

        }

        System.out.println("These are the values you have stored: ");

        for (int i = 0; i < amount; i++) {
        System.out.println(Arrays.toString(data[i]));
    }

    }
}
