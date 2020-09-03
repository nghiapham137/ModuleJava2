package Method;

import Models.NhanVien;
import Models.NhanVienFullTime;
import Models.NhanVienPartTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method implements Service {
    static List<NhanVienFullTime> listFullTime= new ArrayList<>();
    static List<NhanVienPartTime> listPartTime = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void Display() {
        System.out.println("Nhân viên Full time");
        for (NhanVienFullTime nhanVienFullTime : listFullTime) {
            System.out.println(nhanVienFullTime);
        }
        System.out.println("Nhân viên Part Time");
        for (NhanVienPartTime nhanVienPartTime : listPartTime) {
            System.out.println(nhanVienPartTime);
        }
    }

    public void getSalary() {
        System.out.println("Nhập loại nhân viên: ");
        String loaiNhanvien = scanner.nextLine();
        if (loaiNhanvien.equalsIgnoreCase("full time")) {
            System.out.println("Nhập id:");
            int id = Integer.parseInt(scanner.nextLine());
            for (NhanVienFullTime nhanVienFullTime : listFullTime) {
                if (id == nhanVienFullTime.getIdNhanvien()) {
                    System.out.println("Lương thực lĩnh của nhân viên này là: " + nhanVienFullTime.getLuongThucLinh());
                    return;
                }
            }
        }
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (NhanVienPartTime nhanVienPartTime : listPartTime) {
            if (id == nhanVienPartTime.getIdNhanvien()) {
                System.out.println("Lương thực lĩnh của nhân viên này là: " + nhanVienPartTime.getLuongthuclinh());
            }
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tên nhân viên: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại: ");
        int sdt = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập loại nhân viên: ");
        String loaiNhanvien = scanner.nextLine();
        if (loaiNhanvien.equalsIgnoreCase("full time")) {
            System.out.println("Nhập số tiền thưởng: ");
            double tienthuong = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số tiền phạt: ");
            double tienPhat = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập lương cứng: ");
            double luongCung = Double.parseDouble(scanner.nextLine());
            int id = getFullTimeID();
            listFullTime.add(new NhanVienFullTime(++id, ten, tuoi, sdt, email, tienthuong, tienPhat, luongCung));
            System.out.println("Thêm thành công!");
        } else {
            System.out.println("Nhập số giờ làm việc: ");
            double gioLamViec = Double.parseDouble(scanner.nextLine());
            int id = getPartTimeID();
            listPartTime.add(new NhanVienPartTime(++id, ten, tuoi, sdt, email, gioLamViec));
            System.out.println("Thêm thành công!");
        }
    }

    @Override
    public void getAllSalariesOfPartTimeStaff() {
        double tongLuong = 0;
        for (NhanVienPartTime nhanVienPartTime : listPartTime) {
            tongLuong += nhanVienPartTime.getLuongthuclinh();
        }
        System.out.println("Tổn lương nhân viên part time là: " + tongLuong);
    }

    @Override
    public void sortBySalary() {

    }

    @Override
    public void showStaffWithSalaryFewerThanAverageSalary() {
        double tongLuong = 0;
        for (NhanVienFullTime nhanVienFullTime : listFullTime) {
            tongLuong += nhanVienFullTime.getLuongThucLinh();
        }
        double luongTB = tongLuong/listFullTime.size();
        System.out.println("Lương trung bình các nhân viên là: " + luongTB);
        for (NhanVienFullTime nhanVienFullTime : listFullTime) {
            if (nhanVienFullTime.getLuongThucLinh() < luongTB) {
                System.out.println(nhanVienFullTime.getHoTen());
            }
        }
    }

    private int getFullTimeID() {
        int countID = 0;
        for (NhanVienFullTime nhanVienFullTime : listFullTime) {
            if (nhanVienFullTime.getIdNhanvien() > countID) {
                countID = nhanVienFullTime.getIdNhanvien();
            }
        }
        return countID;
    }

    private int getPartTimeID() {
        int countID = 0;
        for (NhanVienPartTime nhanVienPartTime : listPartTime) {
            if (nhanVienPartTime.getIdNhanvien() > countID) {
                countID = nhanVienPartTime.getIdNhanvien();
            }
        }
        return countID;
    }

}
