import java.util.Scanner;

public class leapYearChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the year: ");
            int year = scan.nextInt();
            if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }

        }

    }
}