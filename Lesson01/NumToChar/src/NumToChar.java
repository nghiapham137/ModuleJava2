import java.util.Scanner;

public class NumToChar {
    public static void main(String[] args) {
        System.out.println("Ứng dụng đọc số thành chữ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        int unit2num = number / 10;
        int newUnit =  number - unit2num * 10;

        if (0 <= number && number <= 10){
            String woRd1;
            switch (number){
                case 0:
                    woRd1 = "zero";
                    break;
                case 1:
                    woRd1 = "one";
                    break;
                case 2:
                    woRd1 = "two";
                    break;
                case 3:
                    woRd1 = "three";
                    break;
                case 4:
                    woRd1 = "four";
                    break;
                case 5:
                    woRd1 = "five";
                    break;
                case 6:
                    woRd1 = "six";
                    break;
                case 7:
                    woRd1 = "seven";
                    break;
                case 8:
                    woRd1 = "eight";
                    break;
                case 9:
                    woRd1 = "nice";
                    break;
                case 10:
                    woRd1 = "ten";
                    break;
                default:
                    woRd1 = "Out of Ability";
            }
            System.out.println(woRd1);
        }
        if (10 < number && number < 20){
            String woRd1;

            switch (newUnit){
                case 1:
                    woRd1 = "eleven";
                    break;
                case 2:
                    woRd1 = "twelve";
                    break;
                case 3:
                    woRd1 = "thirteen";
                    break;
                case 4:
                    woRd1 = "fourteen";
                    break;
                case 5:
                    woRd1 = "fifteen";
                    break;
                case 6:
                    woRd1 = "sixteen";
                    break;
                case 7:
                    woRd1 = "seventeen";
                    break;
                case 8:
                    woRd1 = "eighteen";
                    break;
                case 9:
                    woRd1 = "nineteen";
                    break;
                default:
                    woRd1 = "invalid input";
            }
            System.out.println(woRd1);
        }
        if (20 <= number && number< 100) {
            String woRd1,woRd2;
            switch (unit2num){
                case 2:
                    woRd1 = "twenty";
                    break;
                case 3:
                    woRd1 = "thirty";
                    break;
                case 4:
                    woRd1 = "forty";
                    break;
                case 5:
                    woRd1 = "fifty";
                    break;
                case 6:
                    woRd1 = "sixty";
                    break;
                case 7:
                    woRd1 = "seventy";
                    break;
                case 8:
                    woRd1 = "eighty";
                    break;
                case 9:
                    woRd1 = "ninety";
                    break;
                default:
                    woRd1 = "invalid input";
            }

            switch (newUnit){
                case 0:
                    woRd2 = "";
                    break;
                case 1:
                    woRd2 = "one";
                    break;
                case 2:
                    woRd2 = "two";
                    break;
                case 3:
                    woRd2 = "three";
                    break;
                case 4:
                    woRd2 = "four";
                    break;
                case 5:
                    woRd2 = "five";
                    break;
                case 6:
                    woRd2 = "six";
                    break;
                case 7:
                    woRd2 = "seven";
                    break;
                case 8:
                    woRd2 = "eight";
                    break;
                case 9:
                    woRd2 = "nine";
                    break;
                default:
                    woRd2 = "ivalid input";
            }
            System.out.println(woRd1 + " " + woRd2);
        }

        if (100 <= number && number < 1000){
            String woRd1,woRd2 = "",woRd3 = "";
            int hundred = number/ 100;
            int ten = number % 100;
            int ten1 = ten / 10;
            int one = ten % 10;
            switch (hundred){
                case 1:
                    woRd1 = "one hundred";
                    break;
                case 2:
                    woRd1 = "two hundred";
                    break;
                case 3:
                    woRd1 = "three hundred";
                    break;
                case 4:
                    woRd1 = "four hundred";
                    break;
                case 5:
                    woRd1 = "five hundred";
                    break;
                case 6:
                    woRd1 = "six hundred";
                    break;
                case 7:
                    woRd1 = "seven hundred";
                    break;
                case 8:
                    woRd1 = "eight hundred";
                    break;
                case 9:
                    woRd1 = "nine hundred";
                    break;
                default:
                    woRd1 = "ivalid input";
            }

            if (0 <= ten && ten < 10){
                switch (one){
                    case 0:
                        woRd3 = "";
                        break;
                    case 1:
                        woRd3 = "one";
                        break;
                    case 2:
                        woRd3 = "two";
                        break;
                    case 3:
                        woRd3 = "three";
                        break;
                    case 4:
                        woRd3 = "four";
                        break;
                    case 5:
                        woRd3 = "five";
                        break;
                    case 6:
                        woRd3 = "six";
                        break;
                    case 7:
                        woRd3 = "seven";
                        break;
                    case 8:
                        woRd3 = "eight";
                        break;
                    case 9:
                        woRd3 = "nine";
                        break;
                    default:
                        woRd3 = "invalid input";
                }
            }

            if (10 <= ten && ten < 20){
                switch (ten){
                    case 10:
                        woRd2 = "ten";
                        break;
                    case 11:
                        woRd2 = "eleven";
                        break;
                    case 12:
                        woRd2 = "twelve";
                        break;
                    case 13:
                        woRd2 = "thirteen";
                        break;
                    case 14:
                        woRd2 = "fourteen";
                        break;
                    case 15:
                        woRd2 = "fifteen";
                        break;
                    case 16:
                        woRd2 = "sixteen";
                        break;
                    case 17:
                        woRd2 = "seventeen";
                        break;
                    case 18:
                        woRd2 = "eighteen";
                        break;
                    case 19:
                        woRd2 = "nineteen";
                        break;
                    default:
                        woRd2 = "invalid input";
                }
            }

            if (20 <= ten && ten < 100){
                switch (ten1){
                    case 0:
                        woRd2 = "";
                        break;
                    case 2:
                        woRd2 = "twenty";
                        break;
                    case 3:
                        woRd2 = "thirty";
                        break;
                    case 4:
                        woRd2 = "forty";
                        break;
                    case 5:
                        woRd2 = "fifty";
                        break;
                    case 6:
                        woRd2 = "sixty";
                        break;
                    case 7:
                        woRd2 = "seventy";
                        break;
                    case 8:
                        woRd2 = "eighty";
                        break;
                    case 9:
                        woRd2 = "ninety";
                        break;
                    default:
                        woRd2 = "invalid input";
                }

                switch (one){
                    case 0:
                        woRd3 = "";
                        break;
                    case 1:
                        woRd3 = "one";
                        break;
                    case 2:
                        woRd3 = "two";
                        break;
                    case 3:
                        woRd3 = "three";
                        break;
                    case 4:
                        woRd3 = "four";
                        break;
                    case 5:
                        woRd3 = "five";
                        break;
                    case 6:
                        woRd3 = "six";
                        break;
                    case 7:
                        woRd3 = "seven";
                        break;
                    case 8:
                        woRd3 = "eight";
                        break;
                    case 9:
                        woRd3 = "nine";
                        break;
                    default:
                        woRd3 = "invalid input";
                }



            }
            System.out.println(woRd1 +  " " +woRd2 + " " + woRd3);
        }
    }
}

