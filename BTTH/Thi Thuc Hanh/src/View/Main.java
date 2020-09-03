package View;

import IOManager.IOManagement;
import Method.Method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IOManagement ioManagement = new IOManagement();
        Method method = new Method();
        do {
            System.out.println("Quản lý nhân viên: ");
            System.out.println("1. Hiển thị toàn bộ nhân viên ");
            System.out.println("2. Thêm mới nhân viên ");
            System.out.println("3. Tính lương thực lĩnh cho nhân viên");
            System.out.println("4. Liệt kê nhân viên có mức lương dưới trung bình");
            System.out.println("5. Tính tổng lương phải trả cho nhân viên Part time");
            System.out.println("6. Sắp xếp nhân viên toàn thời gian theo lương");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> method.Display();
                case "2" -> method.add();
                case "3" -> method.getSalary();
                case "4" -> method.showStaffWithSalaryFewerThanAverageSalary();
                case "5" -> method.getAllSalariesOfPartTimeStaff();
                case "6" -> method.sortBySalary();
                case "0" -> System.exit(0);
                default -> System.out.println("không có chức năng này");
            }
        }while (true);


    }
}
