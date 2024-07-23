import java.util.Arrays;

public class Workbook612 {
    public static void main(String[] args) {
        int[] ticketOneNumbers = {34, 43, 45, 65, 21, 54};
        int[] ticketTwoNumbers = Arrays.copyOf(ticketOneNumbers, ticketOneNumbers.length);

        System.out.println("Ticket 1 Numbers: " + Arrays.toString(ticketOneNumbers));
        System.out.println("Ticket 2 Numbers: " + Arrays.toString(ticketTwoNumbers));
    }
}
