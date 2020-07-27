import java.util.Scanner;

public class AlertMessage {
    public static void main(String[] args) {
        System.out.println("Hiển thị lời chào");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        System.out.println("Xin chào: " + name);
    }
}
