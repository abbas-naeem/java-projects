import java.util.Scanner;

public class leapYearChecker {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Please enter the year: ");
            int year = scan.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + ", is a leap year");
            } else {
                System.out.println(year + ", is not a leap year");
            }
        }
    }
}
