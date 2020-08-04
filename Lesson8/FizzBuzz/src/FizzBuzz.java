public class FizzBuzz {
    public static String checkFizzBuzz(int number) {
        String result = "";
        if (isDividedBy3(number)&& isDividedBy5(number))
            result = "FizzBuzz";
        else if (isDividedBy5(number))
            result = "Buzz";
        else if (isDividedBy3(number) )
            result = "Fizz";
        else result = Integer.toString(number);
        return result;
    }

    private static boolean isDividedBy3(int number) {
        if (number % 3 == 0)
            return true;
        else return false;
    }

    private static boolean isDividedBy5(int number) {
        if (number % 5 == 0)
            return true;
        else return false;
    }

//    private static boolean isHaving3(int number) {
//        String string = Integer.toString(number);
//        for (int i = 0; i < 2 ; i++) {
//            if (string.charAt(i) == 3 )
//                return true;
//        }
//        return false;
//    }
//
//    private static boolean isHaving5(int number) {
//        String string = Integer.toString(number);
//        for (int i = 0; i < 2 ; i++) {
//            if (string.charAt(i) == 5 )
//                return true;
//        }
//        return false;
//    }
//
//    private static String translateToWord(int number) {
//        String string = Integer.toString(number);
//        for (int i = 0; i < 2; i++) {
//            switch (string.charAt(i)) {
//                case 0:
//                    string.charAt(i) == ;
//            }
//
//        }
//    }




}
