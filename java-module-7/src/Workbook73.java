import java.util.Scanner;

public class Workbook73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Nationality: ");
        String nationality = scan.nextLine();

        System.out.print("Date of Birth: ");
        String dob = scan.nextLine();

        System.out.print("Passport Number: ");
        String passportNumber = scan.nextLine();

        System.out.print("Seat Number: ");
        int seatNumber = scan.nextInt();


        Workbook73_linkData passengerInfo = new Workbook73_linkData(name, nationality, dob, passportNumber, seatNumber);

        System.out.println("Name: " + passengerInfo.getName());
        System.out.println("Nationality: " + passengerInfo.getNationality());
        System.out.println("Date Of Birth: " + passengerInfo.getDob());
        System.out.println("Passport Number: " + passengerInfo.getPassportNumber());
        System.out.println("Seat Number: " + passengerInfo.getSeatNumber());



//        String isInfoCorrect = scan.nextLine();
//        if (isInfoCorrect.equals("Yes") || isInfoCorrect.equals("yes")) {
//            System.out.println("This will now be forwarded to the database, we hope you enjoy your flight!");
//        } else if (isInfoCorrect.equals("No") || isInfoCorrect.equals("no") {
//
//        }

    }
}
