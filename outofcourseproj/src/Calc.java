import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the java calculator service");

        while (true) {
            System.out.println("Please enter the number allocated to your chosen basic arithmetic method: " +
                    "1) Addition " +
                    "2) Subtraction " +
                    "3) Multiplication " +
                    "4) Division");

            String choice = scan.nextLine();

            if (choice.equals("1") || choice.equalsIgnoreCase("one")) {
                System.out.print("Please enter the amount of numbers you want to add: ");
                int numbers = scan.nextInt();
                ArrayList<Double> numbersArray = new ArrayList<>();
                for (int i = 0; i < numbers; i++) {
                    System.out.print((i + 1) + ") ");
                    double num = scan.nextInt();
                    numbersArray.add(num);
                }

                int sum = 0;

                for (int i = 0; i < numbersArray.size(); i++) {
                    sum += numbersArray.get(i);
                }

                System.out.println("");
                System.out.println("The total sum is: " + sum);
            } else if (choice.equals("2") || choice.equalsIgnoreCase("two")) {
                System.out.print("Please enter the main number: ");
                int mainNumber = scan.nextInt();
                System.out.println("");

                System.out.print("Please enter the amount of numbers you want to subtract: ");
                int numbers = scan.nextInt();
                ArrayList<Double> numbersArray = new ArrayList<>();
                for (int i = 0; i < numbers; i++) {
                    System.out.print((i + 1) + ") ");
                    double num = scan.nextInt();
                    numbersArray.add(num);
                }

                for (int i = 0; i < numbersArray.size(); i++) {
                    mainNumber -= numbersArray.get(i);
                }

                System.out.println("");
                System.out.println("The total is: " + mainNumber);
            } else if (choice.equals("3") || choice.equalsIgnoreCase("three")) {
                System.out.print("Please enter the amount of numbers you want to multiply: ");
                int numbers = scan.nextInt();
                ArrayList<Double> numbersArray = new ArrayList<>();
                for (int i = 0; i < numbers; i++) {
                    System.out.print((i + 1) + ") ");
                    double num = scan.nextInt();
                    numbersArray.add(num);
                }

                int sum = 1;

                for (int i = 0; i < numbersArray.size(); i++) {
                    sum *= numbersArray.get(i);
                }

                System.out.println("");
                System.out.println("The total is: " + sum);
            } else if (choice.equals("4") || choice.equalsIgnoreCase("four")) {
                System.out.print("Please enter the main number: ");
                int mainNumber = scan.nextInt();
                System.out.println("");

                System.out.print("Please enter the amount of numbers you want to divide: ");
                int numbers = scan.nextInt();
                ArrayList<Double> numbersArray = new ArrayList<>();
                for (int i = 0; i < numbers; i++) {
                    System.out.print((i + 1) + ") ");
                    double num = scan.nextInt();
                    numbersArray.add(num);
                }

                for (int i = 0; i < numbersArray.size(); i++) {
                    mainNumber /= numbersArray.get(i);
                }

                System.out.println("");
                System.out.println("The total is: " + mainNumber);
            }
        }
    }
}
