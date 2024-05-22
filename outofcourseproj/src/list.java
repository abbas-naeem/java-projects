public class list {

    public static void main(String[] args) {
        int[] numbers = {3, 4, 6, 7, 8};
        int totalEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                totalEven += numbers[i];
            } else {
                continue;
            }
            System.out.println(totalEven);
        }
    }

}
