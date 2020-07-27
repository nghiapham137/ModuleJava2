import java.util.Scanner;

public class ConvertNumtoChar {
    public static void main(String[] args) {
        System.out.println("Ứng dụng đọc số thành chữ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        if (0 <= number && number < 10){
            switch (number){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Out of Ability");
            }
        }
        if (10 <= number && number < 20){
            
        }
    }
}
