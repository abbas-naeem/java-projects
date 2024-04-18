import java.util.Scanner;

public class Workbook59 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = "Abbas";
        String userPass = "StarkActivate1";
        while (true) {
            System.out.println("Username: ");
            String inputUserName = scan.nextLine();
            System.out.println("Password: ");
            String inputUserPass = scan.nextLine();
            if (inputUserName.equals(userName) && inputUserPass.equals(userPass)) {
                System.out.println("Checking the information in the database...");
                System.out.println("Connecting to connected services...");
                System.out.println("You have been connected! " + "Welcome back " + userName);
                break;
            } else {
                System.out.println("Wrong username or password. Try again.");
            }
        }
    }

}
