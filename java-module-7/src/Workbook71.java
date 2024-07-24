import java.util.Arrays;

public class Workbook71 {
    public static void main(String[] args) {
        Workbook71_linkData abbas = new Workbook71_linkData();

        abbas.name = "Muhammad Abbas Naeem";
        abbas.nationality = "British Pakistani";
        abbas.dob = "17th March 2011";

        abbas.passport[0] = abbas.name;
        abbas.passport[1] = abbas.nationality;
        abbas.passport[2] = abbas.dob;

        System.out.println(abbas.name);
        System.out.println(abbas.nationality);
        System.out.println(abbas.dob);
        System.out.println(Arrays.toString(abbas.passport));
    }
}
