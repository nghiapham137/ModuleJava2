import java.util.Scanner;

public class print20PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int printAmount = scanner.nextInt();
        int count = 0;
        int i = 2;
        int number = 1;

        while (count < printAmount){
            boolean check = true;
            if (number < 2)
                check = false;
            for (i = 2; i <= Math.sqrt(number)  ; i++) {
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                count++;
                System.out.println(number + " ");
            }
            number++;

        }

    }
}
