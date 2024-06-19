import java.util.Scanner;

public class gradeCalc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your grade: ");
            int grade = scan.nextInt();
            if (grade >= 90) {
                System.out.println("Grade A");
            } else if (grade >= 80 && grade < 90) {
                System.out.println("Grade B");
            } else if (grade >= 70 && grade < 80) {
                System.out.println("Grade C");
            } else if (grade >= 60 && grade < 70) {
                System.out.println("Grade D");
            } else if (grade < 60) {
                System.out.println("Grade F");
            } else {
                System.out.println("There has been an error, please try again!");
            }
        }

    }
}