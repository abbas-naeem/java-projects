import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
//
//        NEVER DO THIS
//        int[] numbers2 = numbers;

//        The Problem:

        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = staffLastYear;
        staffThisYear[1] = "Abby";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

//        The Solution:

        String[] teachersLastYear = {"Eric", "Ten", "Hag"};
        String[] teachersThisYear = new String[5];
        for (int i = 0; i < teachersLastYear.length; i++) {
            teachersThisYear[i] = teachersLastYear[i];
        }
        teachersThisYear[2] = "Jose";
        System.out.println(" ");
        System.out.println(Arrays.toString(teachersLastYear));
        System.out.println(Arrays.toString(teachersThisYear));

//        Always keep two different arrays seperate!

    }
}
