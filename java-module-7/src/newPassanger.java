public class newPassanger {
    public static void main(String[] args) {
        Workbook73_linkData newPassanger = new Workbook73_linkData("Abbas", "Pakistani", "16/04/2011", "423442342", 32);

        System.out.println("Name: " + newPassanger.getName());
        System.out.println("Nationality: " + newPassanger.getNationality());
        System.out.println("DOB: " + newPassanger.getDob());
        System.out.println("Passport Number: " + newPassanger.getPassportNumber());
        System.out.println("Seat Number: " + newPassanger.getSeatNumber());
        System.out.println(" ");

        newPassanger.setSeatNumber(98);

        System.out.println("Here are your new details: ");
        System.out.println("Name: " + newPassanger.getName());
        System.out.println("Nationality: " + newPassanger.getNationality());
        System.out.println("DOB: " + newPassanger.getDob());
        System.out.println("Passport Number: " + newPassanger.getPassportNumber());
        System.out.println("Seat Number: " + newPassanger.getSeatNumber());


    }
}
