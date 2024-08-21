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

        ArrayList<String> todo = new ArrayList<>();

        while (true) {
            System.out.println(" ");
            System.out.println("Here are the functions: " +
                    "       - Type 'task' to add a task" +
                    "       - Type 'remove' to delete a current task" +
                    "       - Type 'change' to change a task" +
                    "       - Type 'view' to view current tasks"
            );
            String option = scan.nextLine();

            if (option.equalsIgnoreCase("task")) {
                System.out.print("Please enter the number of tasks you want to add: ");
                int amount = scan.nextInt();
                scan.nextLine(); // Consume newline

                for (int i = 0; i < amount; i++) {
                    System.out.print((i + 1) + "): ");
                    String add = scan.nextLine();
                    todo.add(add);
                }

            } else if (option.equalsIgnoreCase("remove")) {
                for (int i = 0; i < todo.size(); i++) {
                    String g = todo.get(i);
                    System.out.println((i + 1) + ": " + g);
                }

                System.out.println(" ");
                System.out.print("Please enter the number of the task you want to remove: ");
                int removeIndex = scan.nextInt() - 1;
                scan.nextLine(); // Consume newline

                if (removeIndex >= 0 && removeIndex < todo.size()) {
                    todo.remove(removeIndex);
                    System.out.println("Task removed.");
                } else {
                    System.out.println("Invalid task number.");
                }

            } else if (option.equalsIgnoreCase("change")) {
                for (int i = 0; i < todo.size(); i++) {
                    String g = todo.get(i);
                    System.out.println((i + 1) + ": " + g);
                }

                System.out.println(" ");
                System.out.print("Please enter the number of the task you want to change: ");
                int changeIndex = scan.nextInt() - 1;
                scan.nextLine(); // Consume newline

                if (changeIndex >= 0 && changeIndex < todo.size()) {
                    System.out.print("Enter the new task: ");
                    String newTask = scan.nextLine();
                    todo.set(changeIndex, newTask);
                    System.out.println("Task updated.");
                } else {
                    System.out.println("Invalid task number.");
                }

            } else if (option.equalsIgnoreCase("view")) {
                System.out.println("Current tasks:");
                for (int i = 0; i < todo.size(); i++) {
                    String g = todo.get(i);
                    System.out.println((i + 1) + ": " + g);
                }

            } else {
                System.out.println("");
                System.out.println("That is not a valid input!");
            }
        }
    }
}