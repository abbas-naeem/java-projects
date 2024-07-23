import java.util.Scanner;

public class vowelOrConsonantChecker {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your character: ");
            String character = scan.nextLine();
            if (character.equals("a")) {
                System.out.println("This is a vowel");
            } else if (character.equals("e")) {
                System.out.println("This is a vowel");
            } else if (character.equals("i")) {
                System.out.println("This is a vowel");
            } else if (character.equals("o")) {
                System.out.println("This is a vowel");
            } else if (character.equals("u")) {
                System.out.println("This is a vowel");
            } else {
                System.out.println("This is a consonant");
            }
        }
    }
}