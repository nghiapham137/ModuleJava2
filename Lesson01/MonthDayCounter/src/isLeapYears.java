import java.util.Scanner;

public class isLeapYears {
    public static void main(String[] args) {
        System.out.println("Kiểm tra một năm xem có là năm nhuận");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập năm bạn muốn kiểm tra: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }

        if (isLeapYear){
            System.out.printf("%d là năm nhuận", year);
        }else {
            System.out.printf("%d ko phải là năm nhuận", year);
        }

    }
}
