package View;

import IOManager.IOManagerment;
import Method.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        Service.list = IOManagerment.readFromFile();
        if (Service.list == null) {
            Service.list = new ArrayList<>();
        }
        do {
            System.out.println("------------------Main Menu-----------------");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị nhân viên");
            System.out.println("3. Hiển thị lương của nhân viên");
            System.out.println("4. Hiển thị các nhân viên lương thấp dưới trung bình");
            System.out.println("5. Sắp xếp lương nhân viên full time");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    service.addEmployee(AddView.addEmployeeView());
                    System.out.println("Thêm thành công!");
                    break;
                case "2":
                    service.showAllEmployees();
                    break;
                case "3":
                    service.getEmployeeSalary();
                    break;
                case "4":
                    service.getEmployeeWithLowPay();
                    break;
                case "5":
                    service.sortingBySalary();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Không có chức năng");
                    break;
            }

        }while (true);

    }
}
