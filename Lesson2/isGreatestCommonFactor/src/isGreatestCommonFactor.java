import java.util.Scanner;

public class isGreatestCommonFactor {
    public static void main(String[] args) {
        System.out.println("Tìm ước chung lớn nhất của 2 số");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("Ko có ước chung lớn nhất");
        }else {
            while (a != b){
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Ước chung lớn nhất là: " + a);
        }
    }
}
