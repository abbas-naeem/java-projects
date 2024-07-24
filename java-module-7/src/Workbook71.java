import java.util.Arrays;
import java.util.Scanner;

public class Workbook71 {
    public static void main(String[] args) {
        Workbook71_linkData user = new Workbook71_linkData();
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name: ");
        user.name = scan.nextLine();
        System.out.print("What is your nationality: ");
        user.nationality = scan.nextLine();
        System.out.print("What is your date of birth: ");
        user.dob = scan.nextLine();

        user.passport[0] = user.name;
        user.passport[1] = user.nationality;
        user.passport[2] = user.dob;

        System.out.println(user.name);
        System.out.println(user.nationality);
        System.out.println(user.dob);
        System.out.println(" ");
        System.out.println(Arrays.toString(user.passport));
    }
}
