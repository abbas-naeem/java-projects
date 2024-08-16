public class Person {
    public static void main(String[] args) {
        Person_Link rayan = new Person_Link("Rayan Slim", "Canadian", "01/01/1998", Person_Link.chooseSeat(), Person_Link.applyPassport());

        System.out.println("Here is your information: ");
        System.out.println();

        System.out.println("Name: " + rayan.getName());
        System.out.println("Nationality: " + rayan.getNationality());
        System.out.println("Date Of Birth: " + rayan.getDob());
        System.out.println("Seat Number: " + rayan.getSeatNumber());

        if (Boolean.TRUE.equals(rayan.getAccepted())) {
            System.out.println(" ");
            System.out.println("Congratulations Rayan Slim. Your passport was approved!");
        } else if (Boolean.FALSE.equals(rayan.getAccepted())) {
            System.out.println(" ");
            System.out.println("We are sorry Rayan Slim. We cannot process your application.");
        } else {
            System.out.println(" ");
            System.out.println("There was an error in processing your passport please contact the support team to get this resolved!");
        }
    }

}
