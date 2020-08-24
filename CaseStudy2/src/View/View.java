package View;

import IOManagement.IOManager;
import Models.Officer;
import Service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) throws Exception {
        IOManager ioManager = new IOManager();
        List<Officer> list ;
        list = ioManager.readFromFile();

        Service service = new Service(list);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Main menu");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Hiển thị cán bộ");
            System.out.println("3. Tìm kiếm các bộ");
            System.out.println("4. Hiển thị tổng thu nhập");
            System.out.println("5. Chỉnh sửa thông tin");
            System.out.println("6. Xóa thông tin cán bộ");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    service.add();
                    break;
                case 2:
                    service.show();
                    break;
                case 3:
                    service.search();
                    break;
                case 4:
                    service.getTotalIncome();
                    break;
                case 5:
                    service.update();
                    break;
                case 6:
                    service.remove();
                    break;
                case 0:
                    ioManager.writeToFile(list);
                    System.exit(0);
                default:
                    throw new Exception("Không có chức năng này");
            }
        }while (true);

    }
}
