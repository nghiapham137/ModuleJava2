package View;

import Method.Validate;
import Models.Employee;
import Models.FullTimeEmployee;
import Models.PartTimeEmployee;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class AddView {
    public static Employee addEmployeeView() {
        Scanner scanner = new Scanner(System.in);
        String ID;
        do {
            System.out.println("Mẫu ID: FT0001/ PT0001");
            System.out.println("FT: nhân viên full time");
            System.out.println("PT: nhân viên part time");
            System.out.println("Nhập ID cho nhân viên: ");
            try {
                ID = scanner.nextLine();
                if (Validate.validate(ID, Validate.ID_REGEX)) break;
            }catch (Exception ignored) {}
             System.out.println("Nhập sai, nhập lại!");
        }while (true);

        String name;
        do {
            System.out.println("Nhập họ tên: ");
            try {
                name = scanner.nextLine();
                if (!name.equalsIgnoreCase("")) break;
            }catch (Exception ignored){}
             System.out.println("Tên không được để trống!");
        }while (true);

        int age;
        do {
            System.out.println("Nhập tuổi: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age > 0 || age < 80) break;
            }catch (Exception ignored) {}
             System.out.println("Nhập sai tuổi, nhập lại!");
        }while (true);

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại: ");
            try {
                phoneNumber = scanner.nextLine();
                if (Validate.validate(phoneNumber, Validate.PHONENUMBER_REGEX)) break;
            }catch (Exception ignored) {}
             System.out.println("Sai định dạng!");
        }while (true);

        String email;
        do {
            System.out.println("Nhập email: ");
            try {
                email = scanner.nextLine();
                if (Validate.validate(email, Validate.EMAIL_REGEX)) break;
            }catch (Exception ignored) {}
             System.out.println("Sai định dạng!");
        }while (true);

        int phoneNumberInt = Integer.parseInt(phoneNumber);

        if (getIDFirstChar(ID)) {
            double basicPay;
            do {
                System.out.println("Nhập lương cơ bản: ");
                try {
                    basicPay = Double.parseDouble(scanner.nextLine());
                    if (basicPay >= 0) break;
                }catch (Exception ignored) {}
                 System.out.println("Nhập sai định dạng, nhập lại!");
            }while (true);

            double bonus;
            do {
                System.out.println("Nhập tiền thưởng: ");
                try {
                    bonus = Double.parseDouble(scanner.nextLine());
                    if (bonus > 0) break;
                }catch (Exception ignored) {}
                 System.out.println("Nhập sai định dạng, nhập lại!");
            }while (true);

            double fine;
            do {
                System.out.println("Nhập tiền phạt: ");
                try {
                    fine = Double.parseDouble(scanner.nextLine());
                    if (bonus > 0) break;
                }catch (Exception ignored) {}
                 System.out.println("Nhập sai định dạng, nhập lại");
            }while (true);

            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(ID, name, age, phoneNumberInt, email, basicPay, bonus, fine);
            return fullTimeEmployee;
        }else {

            double workingTime;
            do {
                System.out.println("Nhập số giờ làm việc: ");
                try {
                    workingTime = Double.parseDouble(scanner.nextLine());
                    if (workingTime > 0) break;
                }catch (Exception ignored) {}
                 System.out.println("Nhập sai định dạng, nhập lại!");
            }while (true);

            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(ID, name, age, phoneNumberInt, email, workingTime);

            return partTimeEmployee;
        }

    }

    public static boolean getIDFirstChar(String ID) {
        char ch = ID.charAt(0);
        String id = String.valueOf(ch);
        if (id.equalsIgnoreCase("F")) {
            return true;
        }else return false;
    }
}
