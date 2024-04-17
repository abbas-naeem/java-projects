public class Workbook57 {

    public static void main(String[] main) {
                for (int i = 0; i <= 18; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println(i + ": " + "FizzBuzz");
                        System.out.println("");
                    } else if (i % 3 == 0) {
                        System.out.println(i + ": " + "Fizz");
                        System.out.println("");
                    } else if (i % 5 == 0) {
                        System.out.println(i + ": " + "Buzz");
                        System.out.println("");
                    } else if (i % 3 != 0 || i % 5 != 0) {
                        System.out.println(i + ": ");
                        System.out.println("");
                    }
                    else {
                        System.out.println(i + "We had an error processing this, please try again or contact the administrator to fix this bug!");
                    }
                    }
                }
            }

