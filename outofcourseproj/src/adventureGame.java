import java.util.Scanner;

public class adventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Based Decision Game!");
        System.out.println("You will answer a series of questions which will decide your fate");

        System.out.println(" ");
        System.out.print("Do you want to enter this cave: ");

        String decision = scan.nextLine();

            if (decision.equals("yes") || decision.equals("Yes")) {
                System.out.println(" ");

                System.out.print("Do you want to go left or right: ");
                String leftOrRight = scan.nextLine();



                if (leftOrRight.equals("left") || leftOrRight.equals("Left")) {
                    System.out.println(" ");
                    System.out.print("You have discovered a treasure chest!");

                    System.out.print("Would you like to open it: ");
                    String open = scan.nextLine();

                    while (true) {
                        if (open.equals("yes") || open.equals("Yes")) {
                            System.out.println(" ");
                            System.out.println("You unlocked the treasure!");
                            System.out.println("Thank you for playing");
                            break;
                        } else if (open.equals("no") || open.equals("No")) {
                            System.out.println(" ");
                            System.out.println("You missed out!");
                            System.out.println("Thank you for playing");
                            break;
                        }
                    }

                } else if (leftOrRight.equals("right") || leftOrRight.equals("Right")) {
                    System.out.println(" ");
                    System.out.print("You have encountered a sleeping dragon!");

                    System.out.print("Would you like to fight it: ");
                    String fightOrRun = scan.nextLine();

                    while (true) {
                        if (fightOrRun.equals("yes") || fightOrRun.equals("Yes")) {
                            System.out.println(" ");
                            System.out.println("You won the fight!");
                            System.out.println("Thank you for playing");
                            break;
                        } else if (fightOrRun.equals("no") || fightOrRun.equals("No")) {
                            System.out.println(" ");
                            System.out.println("You escaped the cave!");
                            System.out.println("Thank you for playing");
                            break;
                        }

                    }
                }
            } else if (decision.equals("no") || decision.equals("No")) {
                System.out.print("Would you like to explore this area: ");
                String exploreOrLeave = scan.nextLine();

                while (true) {
                    if (exploreOrLeave.equals("yes") || exploreOrLeave.equals("Yes")) {
                        System.out.println(" ");
                        System.out.println("You have fully explored the forests!");
                        System.out.println("Thank you for playing");
                        break;
                    } else if (exploreOrLeave.equals("no") || exploreOrLeave.equals("No")) {
                        System.out.println(" ");
                        System.out.println("You went home!");
                        System.out.println("Thank you for playing");
                        break;
                    } else {
                        System.out.println("");
                        System.out.println("That is not a valid answer please try again!");
                        continue;
                    }

                }
            }
        }
    }