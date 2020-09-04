package View;

import java.util.Scanner;

public class EmployeeType {
    public static String getEmployeeType() {
        Scanner scanner = new Scanner(System.in);
        String EmployeeType;
        do {
            System.out.println("Nhập loại nhân viên: ");
            try {
                EmployeeType = scanner.nextLine();
                if (!EmployeeType.equals("")) break;
            }catch (Exception ignored) {}
            System.out.println("Sai định dạng, nhập lại!");
        }while (true);
        return EmployeeType;
    }
}
