import java.util.Scanner;

public class bankSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Java Bank LTD");

        System.out.println("You have a free starter pack money from Java Bank LTD of £3000");

        bankSystem_Link current = new bankSystem_Link(678578, "Muhammad Abbas Naeem", 3000);

        while (true) {

            System.out.print("Would you like to make a transaction, deposit, withdrawal or info: ");
            String option = scan.nextLine();

            if (option.equals("transaction") || option.equals("Transaction")) {
                System.out.println("Welcome to the Java Bank Transaction System!");

                System.out.print("Please enter the account number: ");
                int accountNumber = scan.nextInt();
                scan.nextLine();

                System.out.print("Please enter the account holder name: ");
                String accountHolderName = scan.nextLine();

                while (true) {
                    System.out.print("Please enter the amount you want to send: ");
                    int send = scan.nextInt();
                    if (send > current.getBalance()) {
                        System.out.println(" ");
                        System.out.println("Your balance is too low!");
                    } else {
                        System.out.println(" ");
                        System.out.println("Your payment to " + accountHolderName + " has successfully been sent!");
                        break;
                    }
                }


            } else if (option.equals("deposit") || option.equals("Deposit")) {
                System.out.println("Welcome to the Java Bank Deposit System");

                System.out.print("Please enter an amount you want to deposit into this account: ");
                double amountIn = scan.nextInt();

                current.setBalance(amountIn += current.getBalance());
            } else if (option.equals("withdrawal") || option.equals("Withdrawal")) {
                System.out.println("Welcome to the Java Bank Withdrawal System");

                while (true) {
                    System.out.print("Please enter an amount you want to withdraw from this account: ");
                    double amountOut = scan.nextInt();

                    if (amountOut > current.getBalance()) {
                        System.out.println(" ");
                        System.out.println("Your balance is too low");
                    } else {
                        current.setBalance(current.getBalance() - amountOut);
                        System.out.println(" ");
                        System.out.println("You have successfully withdrew " + amountOut);
                        break;
                    }

                }

            } else if (option.equals("info") || option.equals("Info")) {
                System.out.println("The Account Number is: " + current.getAccountNumber());
                System.out.println("The account holder is: " + current.getAccountHolder());
                System.out.println("The balance is: " + current.getBalance());
            }
        }
    }
}
