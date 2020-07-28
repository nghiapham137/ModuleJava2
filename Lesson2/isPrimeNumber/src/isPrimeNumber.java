import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Kiểm tra một số có phải là số nguyên dương.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một số nguyên: ");
        int number = scanner.nextInt();

        if (number < 2){
            System.out.printf("%d ko phải là số nguyên tố",number);
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.printf("%d là số nguyên tố",number);
            else
                System.out.printf("%d ko phải là số nguyên tố", number);
        }
    }
}
