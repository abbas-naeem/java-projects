import java.util.Scanner;
import java.util.ArrayList;

public class User_TODO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Java To-Do List");
        System.out.println("Please register to this service before use: ");
        System.out.println(" ");

        System.out.print("Username: ");
        String userName = scan.nextLine();

        System.out.print("Password: ");
        String password = scan.nextLine();

        User user = new User(userName, password);

        System.out.println(" ");
        System.out.print("Thank you for registering with our service!");



        System.out.println(" ");
        System.out.print("Here are the function: " +
                "       - Type 'task' to add a task" +
                "       - Type 'remove' to delete a current task" +
                "       - Type 'change' to change a task" +
                "       - Type 'view' to add a current task"
        );
        String option = scan.nextLine();

        ArrayList todo = new ArrayList(2);

        if (option.equals("task") || option.equals("Task")) {
            System.out.print("Please enter the number of tasks you want to add: ");
            int amount = scan.nextInt();

            for (int i = 0; i < amount; i++) {
                System.out.print(i + "): ");
                String add = scan.nextLine();

                todo.add(i);

            }

        } else if (option.equals("remove") || option.equals("Remove")) {
            for (int i = 0; i < todo.size(); i++) {
                String g = (String) todo.get(i);
                System.out.println(i + g);
            }

            System.out.println(" ");
            System.out.print("Please enter the number of the task you want to remove: ");
            scan.nextLine();

        } else if (option.equals("change") || option.equals("Change")) {

        } else if (option.equals("view") || option.equals("View")) {

        } else {
            System.out.println("");
            System.out.println("That is not a valid input!");
        }



    }
}
