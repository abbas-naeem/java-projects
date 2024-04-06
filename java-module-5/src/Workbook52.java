import java.util.Scanner;

public class Workbook52 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Bart I can write lines for you.");
        System.out.println("What do you want me to write?");
        String phrase = scan.nextLine();
        for (int i = 0; i <= 99; i++) {
            System.out.println(i + ". " + phrase);
        }
    }

}
