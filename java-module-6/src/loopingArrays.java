public class loopingArrays {
    public static void main(String[] args) {
        int[][] grades = {
                {72, 74, 78, 76},
                {21, 43, 76, 90},
                {34, 4, 89, 99},
        };

        for (int i = 0; i < grades[2].length; i++) {
            System.out.println(grades[2][i]);
        }
    }
}
