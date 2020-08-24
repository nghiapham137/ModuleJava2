package Controller;

import Models.Officer;
import Models.OfficersManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service implements I_Service{
    List<Officer> list = OfficersManagement.list;

    Scanner scanner = new Scanner(System.in);
    public void add() {
        System.out.println("nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.println("Nhập quê quán: ");
        String homeTown = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        int yearOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chuyên môn: ");
        String specialize = scanner.nextLine();
        System.out.println("Nhập trình độ: ");
        String level = scanner.nextLine();
        System.out.println("Nhập hệ số lương: ");
        Float coefficientsSalary = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập phụ cấp trách nhiệm: ");
        Float responsibilityAllowance = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập phụ cấp ăn trưa: ");
        Float lunchBenefit = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập năm tăng lương: ");
        int yearOfSalaryIncrease = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập xếp loại lao động: ");
        String laborClassification = scanner.nextLine();
        int id = ++OfficersManagement.id;
        list.add(new Officer(id,name,sex,homeTown,yearOfBirth,specialize,level,coefficientsSalary,responsibilityAllowance,lunchBenefit,yearOfSalaryIncrease,laborClassification));
        System.out.println("Thêm nhân viên thành công");
    }

    public void show() throws Exception {

        String yesOrNo = null;
        do {

            System.out.println("1. Hiển thị tất cả các bộ trong danh sách");
            System.out.println("2. Hiển thị cán bộ theo thời điểm nâng lương");
            System.out.println("3. Hiển thị các bộ theo giới tính");
            System.out.println("4. Hiển thị cán bộ theo chuyên môn");
            System.out.println("5. Hiển thị cán bộ theo xếp loại lao động");
            System.out.println("0. Thoát chức năng");
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    showAll();
                    break;
                case 2:
                    showOfficersByYearOfSalaryIncrease();
                    break;
                case 3:
                    showOfficersBySex();
                    break;
                case 4:
                    showOfficersBySpecialize();
                    break;
                case 5:
                    showOfficersByLaborClassification();
                    break;
                default:
                    throw new Exception("Không có chức năng này");
            }

            System.out.println("Bạn có muốn sử dụng tiếp chức năng này?");
            yesOrNo = scanner.nextLine();
            if (yesOrNo.equalsIgnoreCase("n")) break;
        }while (!yesOrNo.equalsIgnoreCase("n"));

    }

    public void search() {
        System.out.println("Nhập id cán bộ muốn tìm kiếm: ");
        int officerID = Integer.parseInt(scanner.nextLine());
        for (Officer officer : list) {
            if (officerID == officer.getOfficerId()) {
                System.out.println(officer.toString());
                return;
            }
        }
        System.out.println("Cán bộ này không có trong danh sách");
    }

    public void getTotalIncome() {

    }

    public void update() throws Exception {
        System.out.println("Nhập id nhân viên: ");
        int officerID = Integer.parseInt(scanner.nextLine());
        for (Officer officer : list) {
            if (officerID == officer.getOfficerId()) {
                String yesOrNo = null;
                do {
                    System.out.println("Bạn có muốn tiếp tục chỉnh sửa: ");
                    yesOrNo = scanner.nextLine();
                    if (yesOrNo.equalsIgnoreCase("n")) break;
                    System.out.println("1. Chỉnh sửa tên nhân viên");
                    System.out.println("2. Chỉnh sửa giới tính");
                    System.out.println("3. Chỉnh sửa quê quán");
                    System.out.println("4. Chỉnh sửa năm sinh");
                    System.out.println("5. Chỉnh sửa chuyên môn");
                    System.out.println("6. Chỉnh sửa trình độ");
                    System.out.println("7. Chỉnh sửa hệ số lương");
                    System.out.println("8. Chỉnh sửa phụ cấp trách nhiệm");
                    System.out.println("9. Chỉnh sửa phụ cấp ăn trưa");
                    System.out.println("10. Chỉnh sửa năm tăng lương");
                    System.out.println("11. Chỉnh sửa xếp loại lao động");
                    System.out.println("Nhập lựa chọn: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập tên nhân viên: ");
                            String name = scanner.nextLine();
                            officer.setFullName(name);
                            break;
                        case 2:
                            System.out.println("Nhập giới tính: ");
                            String sex = scanner.nextLine();
                            officer.setSex(sex);
                            break;
                        case 3:
                            System.out.println("Nhập quê quán: ");
                            String homeTown = scanner.nextLine();
                            officer.setHomeTown(homeTown);
                            break;
                        case 4:
                            System.out.println("Nhập năm sinh: ");
                            int year = Integer.parseInt(scanner.nextLine());
                            officer.setYearOfBirth(year);
                            break;
                        case 5:
                            System.out.println("Nhập chuyên môn: ");
                            String specialize = scanner.nextLine();
                            officer.setSpecialize(specialize);
                            break;
                        case 6:
                            System.out.println("Nhập trình độ: ");
                            String level = scanner.nextLine();
                            officer.setLevel(level);
                            break;
                        case 7:
                            System.out.println("Nhập hệ số lương: ");
                            Float coefficientSalary = Float.parseFloat(scanner.nextLine());
                            officer.setCoefficientsSalary(coefficientSalary);
                            break;
                        case 8:
                            System.out.println("Nhập phụ cấp trách nhiệm: ");
                            Float responsibilitySalary = Float.parseFloat(scanner.nextLine());
                            officer.setResponsibilityAllowance(responsibilitySalary);
                            break;
                        case 9:
                            System.out.println("Nhập phụ cấp ăn trưa: ");
                            Float lunchBenefit = Float.parseFloat(scanner.nextLine());
                            officer.setLunchBenefit(lunchBenefit);
                            break;
                        case 10:
                            System.out.println("Nhập năm tăng lương:");
                            int yearOfSalaryIncrease = Integer.parseInt(scanner.nextLine());
                            officer.setYearOfSalaryIncrease(yearOfSalaryIncrease);
                            break;
                        case 11:
                            System.out.println("Nhập xếp loại lao động: ");
                            String laborClassification = scanner.nextLine();
                            officer.setLaborClassification(laborClassification);
                            break;
                        default:
                            throw new Exception("Chức năng này không có");
                    }
                }while (!yesOrNo.equalsIgnoreCase("n"));

            }
        }

    }

    public void remove() {

    }

    private void showAll() {
        for (Officer officer : list) {
            System.out.println("Nhân viên: " + officer.getFullName() + " ,ID: " + officer.getOfficerId());
        }
    }

    private void showOfficersByYearOfSalaryIncrease() {
        int count = 0;
        System.out.println("Nhập thời điểm tăng lương: ");
        int year = Integer.parseInt(scanner.nextLine());
        for (Officer officer : list) {
            if (year == officer.getYearOfSalaryIncrease()) {
                System.out.println("Nhân viên: " + officer.getFullName() + ", ID: " + officer.getOfficerId() + ", Năm tăng lương: " + officer.getYearOfSalaryIncrease());
            }else {
                count++;
            }
        }
        if (count == list.size()) {
            System.out.println("Không có nhân viên nào đến thời điểm tăng lương này");
        }
//
    }

    private void showOfficersBySex() {
        System.out.println("Nhập vào giới tính của nhân viên: ");
        String sex = scanner.nextLine();
        for (Officer officer : list) {
            if (sex.equals(officer.getSex())) {
                System.out.println("Nhân viên: " + officer.getFullName() + ", ID: " + officer.getOfficerId() + ", Giới tính: " + officer.getSex());
                return;
            }
        }
        System.out.println("Không có nhân viên nào thuộc giới tính này");
    }

    private void showOfficersBySpecialize() {
        System.out.println("Nhập vào chuyên môn của nhân viên: ");
        String specialize = scanner.nextLine();
        for (Officer officer : list) {
            if (specialize.equals(officer.getSpecialize())) {
                System.out.println("Nhân viên: " + officer.getFullName() + ", ID: " + officer.getOfficerId() + ", Chuyên môn: " + officer.getSpecialize());
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên nào thuộc chuyên ngành này");
    }

    private void showOfficersByLaborClassification() {
        System.out.println("Nhập xếp loại lao động: ");
        String laborClassification = scanner.nextLine();
        for (Officer officer : list) {
            if (laborClassification.equals(officer.getLaborClassification())) {
                System.out.println("Nhân viên: " + officer.getFullName() + ", ID: " + officer.getOfficerId() + ", Xếp loại: " + officer.getLaborClassification());
                return;
            }
        }
        System.out.println("Không có nhân viên nào thuộc xếp loại này");
    }
}
