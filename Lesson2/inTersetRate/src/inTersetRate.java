import java.util.Scanner;

public class inTersetRate {
    public static void main(String[] args) {
        System.out.println("Ứng dụng tính tiền lãi vay của ngân hàng");

        Scanner scanner = new Scanner(System.in);
        double money, interset_rate, interset_amount = 0;
        int month;

        System.out.println("Nhập vào số tiền đã gửi: ");
        money = scanner.nextDouble();
        System.out.println("Nhập vào tỉ lệ lãi suất: ");
        interset_rate = scanner.nextDouble();
        System.out.println("Nhập vào số tháng gửi: ");
        month = scanner.nextInt();

        for (int i = 0; i < month; i++){
            interset_amount += money * (interset_rate/100/12) * month;
        }

        System.out.println("Tiền lãi nhận được là: " + interset_amount);
    }
}
