import java.util.Scanner;

public class MonthDayCounter {
    public static void main(String[] args) {
        System.out.println("Đếm số ngày trong 1 tháng");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tháng muốn kiểm tra: ");
        int month = scanner.nextInt();

        String daysInMonth;

        switch (month) {
            case 2:
                daysInMonth = "28 hoặc 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth =  "31";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth == ""){
            System.out.print("Sô không hợp lệ");
        }else {
            System.out.printf("Tháng %d có %s ngày", month , daysInMonth);
        }
    }
}
