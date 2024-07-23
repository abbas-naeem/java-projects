import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {

    int[][] grades = {
            {72, 74, 78, 76},
            {21, 43, 76, 90},
            {34, 4, 89, 99},
    };


// Another Way:

//        int[][] grades = new int[3][4];
//                  grades[0][0] = 72;
//                  grades[0][1] = 74;
//                  grades[0][2] = 78;
//                  grades[0][3] = 76;
//
//                  grades[1][0] = 21;
//                  grades[1][1] = 43;
//                  grades[1][2] = 76;
//                  grades[1][3] = 90;
//
//                  grades[2][0] = 34;
//                  grades[2][1] = 4;
//                  grades[2][2] = 89;
//                  grades[2][3] = 99;


        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tBellingham: " + Arrays.toString(grades[1]));
        System.out.println("\tGallagher: " + Arrays.toString(grades[2]));
    }
}
