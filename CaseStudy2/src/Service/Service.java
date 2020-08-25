package Service;

import Models.Officer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service implements I_Service{

    List<Officer> list = new ArrayList<>();
    public Service(List<Officer> list) {
        this.list = list;
    }

    Scanner scanner = new Scanner(System.in);


    public void add() {
        String name;
        do {
            System.out.println("nhập tên cán bộ: ");
            name = scanner.nextLine();
            if (name.equals("")) System.out.println("Không được để trống!");
            else break;
        }while (true);

        String gender;
        do {
            System.out.println("Nhập giới tính: ");
            gender = scanner.nextLine();
            if (gender.equals("")) System.out.println("Không được để trống!");
            else break;
        }while (true);

        String homeTown;
        do {
            System.out.println("Nhập quê quán: ");
            homeTown = scanner.nextLine();
            if (homeTown.equals("")) System.out.println("Không được để trống!");
            else break;
        }while (true);

        int yearOfBirth;
        do {
            System.out.println("Nhập năm sinh(yyyy): ");
            try {
                yearOfBirth = Integer.parseInt(scanner.nextLine());
                if (yearOfBirth > 0) break;
            } catch (Exception ignored) {}
            System.out.println("Nhập sai định dạng năm");
        }while (true);

        String specialize;
        do {
            System.out.println("Nhập chuyên môn: ");
            specialize = scanner.nextLine();
            if (specialize.equals("")) System.out.println("Không được để trống");
            else break;
        }while (true);

        String level;
        do {
            System.out.println("Nhập trình độ: ");
            level = scanner.nextLine();
            if (level.equals("")) System.out.println("Không được để trống");
            else break;
        }while (true);

        double coefficientsSalary;
        do {
            System.out.println("Nhập hệ số lương(0.1 -> 14.9): ");
            try {
                coefficientsSalary = Double.parseDouble(scanner.nextLine());
                if (coefficientsSalary > 0 && coefficientsSalary < 15) break;
            } catch (Exception ignored) {}
            System.out.println("Nhập không hợp lệ");
        }while (true);

        double responsibilityAllowance;
        do {
            System.out.println("Nhập phụ cấp trách nhiệm(0.1 -> 2.0): ");
            try {
                responsibilityAllowance = Double.parseDouble(scanner.nextLine());
                if (responsibilityAllowance > 0 && responsibilityAllowance <= 2.0 ) break;
            } catch (Exception ignored) {}
            System.out.println("Nhập không hợp lệ");
        }while (true);

        double lunchBenefit;
        do {
            System.out.println("Nhập phụ cấp ăn trưa(0 -> 100000): ");
            try {
                lunchBenefit = Double.parseDouble(scanner.nextLine());
                if (lunchBenefit > 0 && lunchBenefit <= 100000) break;
            } catch (Exception ignored) {}
            System.out.println("Nhập không hợp lệ");
        }while (true);

        int yearOfSalaryIncrease;
        do {
            System.out.println("Nhập năm tăng lương(yyyy): ");
            try {
                yearOfSalaryIncrease = Integer.parseInt(scanner.nextLine());
                if (yearOfSalaryIncrease > 0) break;
            } catch (Exception ignored) {}
            System.out.println("Nhập không hợp lệ");
        }while (true);

        String laborClassification;
        do {
            System.out.println("Nhập xếp loại lao động: ");
            laborClassification = scanner.nextLine();
            if (laborClassification.equals("")) System.out.println("Không được để trống");
            else break;
        }while (true);

        int id = checkId();
        list.add(new Officer(++id,name,gender,homeTown,yearOfBirth,specialize,level,coefficientsSalary,responsibilityAllowance,lunchBenefit,yearOfSalaryIncrease,laborClassification));
        System.out.println();
        System.out.println("Thêm cán bộ thành công!");
        System.out.println();
    }

    public void show() throws Exception {

        String yesOrNo = null;
        do {

            System.out.println("1. Hiển thị tất cả các bộ trong danh sách");
            System.out.println("2. Hiển thị cán bộ theo thời điểm nâng lương");
            System.out.println("3. Hiển thị các bộ theo giới tính");
            System.out.println("4. Hiển thị cán bộ theo chuyên môn");
            System.out.println("5. Hiển thị cán bộ theo xếp loại lao động");
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
                    showOfficersByGender();
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

            System.out.println("Ấn 0 để thoát, ấn phím bất kỳ để tiếp tục:");
            yesOrNo = scanner.nextLine();
            if (yesOrNo.equalsIgnoreCase("0")) break;
        }while (!yesOrNo.equalsIgnoreCase("0"));

    }

    public void search() {
        int officerID;
        do {
            System.out.println("Nhập id cán bộ muốn tìm kiếm: ");
            try {
                officerID = Integer.parseInt(scanner.nextLine());
                if (officerID > 0) break;
            } catch (Exception ignored) {}
            System.out.println("Nhập không hợp lệ");
        }while (true);

        for (Officer officer : list) {
            if (officerID == officer.getOfficerId()) {
                System.out.println(officer.toString());
                return;
            }
        }
        System.out.println("Cán bộ này không có trong danh sách");
    }

    public void getTotalIncome() {
        double totalIncome = 0;
        for (Officer officer : list) {
            totalIncome += officer.getSalary();
        }
        System.out.println("Tổng thu nhập của toàn bộ cán bộ trong danh sách là: ");
        System.out.printf("%.0f VND",totalIncome);
        System.out.println();
    }

    public void update() throws Exception {
        int officerID;
        do {
            System.out.println("Nhập id cán bộ: ");
            try {
                officerID = Integer.parseInt(scanner.nextLine());
                if (officerID > 0) break;
            } catch (Exception ignored) {}
            System.out.println("Nhập không hợp lệ");
        }while (true);

        for (Officer officer : list) {
            if (officerID == officer.getOfficerId()) {
                String yesOrNo = null;
                do {
                    System.out.println("1. Chỉnh sửa tên cán bộ");
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
                            System.out.println("Nhập tên cán bộ: ");
                            String name = scanner.nextLine();
                            officer.setFullName(name);
                            break;
                        case 2:
                            System.out.println("Nhập giới tính: ");
                            String gender = scanner.nextLine();
                            officer.setGender(gender);
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
                            Double coefficientSalary = Double.parseDouble(scanner.nextLine());
                            officer.setCoefficientsSalary(coefficientSalary);
                            break;
                        case 8:
                            System.out.println("Nhập phụ cấp trách nhiệm: ");
                            Double responsibilitySalary = Double.parseDouble(scanner.nextLine());
                            officer.setResponsibilityAllowance(responsibilitySalary);
                            break;
                        case 9:
                            System.out.println("Nhập phụ cấp ăn trưa: ");
                            Double lunchBenefit = Double.parseDouble(scanner.nextLine());
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
                    System.out.println("Ấn 0 để thoát, ấn phím bất kỳ để tiếp tục");
                    yesOrNo = scanner.nextLine();
                    if (yesOrNo.equalsIgnoreCase("0")) break;
                }while (!yesOrNo.equalsIgnoreCase("0"));
                return;
            }
        }
        System.out.println("Không có cán bộ nào mang Id này");

    }

    public void remove() {
        System.out.println("Nhập ID cán bộ muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Officer officer : list) {
            if (id == officer.getOfficerId()) {
                list.remove(officer);
                System.out.println("Xóa thành công!");
            }
        }
    }

    private void showAll() {
        for (Officer officer : list) {
            System.out.println("ID: " + officer.getOfficerId() + " " +" "+" " + "Cán bộ: " + officer.getFullName());
        }
    }

    private void showOfficersByYearOfSalaryIncrease() {
        int count = 0;
        System.out.println("Nhập thời điểm tăng lương: ");
        int year = Integer.parseInt(scanner.nextLine());
        for (Officer officer : list) {
            if (year == officer.getYearOfSalaryIncrease()) {
                System.out.println("ID: " + officer.getOfficerId() + " " +" "+" " +"Cán bộ: " + officer.getFullName()
                        + " " +" "+" " + "Năm tăng lương: " + officer.getYearOfSalaryIncrease());
            }else {
                count++;
            }
        }
        if (count == list.size()) {
            System.out.println("Không có cán bộ nào đến thời điểm tăng lương này");
        }
//
    }

    private void showOfficersByGender() {
        int count = 0;
        System.out.println("Nhập vào giới tính của cán bộ: ");
        String gender = scanner.nextLine();
        for (Officer officer : list) {
            if (gender.equalsIgnoreCase(officer.getGender())) {
                System.out.println("ID: " + officer.getOfficerId() + " " +" "+" " + "Cán bộ: "
                        + officer.getFullName() + " " +" "+" " + "Giới tính: " + officer.getGender());
            }else count++;
        }
        if (count == list.size()) {
            System.out.println("Không có cán bộ nào thuộc giới tính này");
        }

    }

    private void showOfficersBySpecialize() {
        int count = 0;
        System.out.println("Nhập vào chuyên môn của các bộ: ");
        String specialize = scanner.nextLine();
        for (Officer officer : list) {
            if (specialize.equalsIgnoreCase(officer.getSpecialize())) {
                System.out.println("ID: " + officer.getOfficerId() +" " +" "+" " +
                        "Cán bộ: " + officer.getFullName() +" " +" "+" " +  "Chuyên môn: " + officer.getSpecialize());
            } else count++;
        }
        if (count == list.size()) {
            System.out.println("Không tìm thấy cán bộ nào thuộc chuyên ngành này");
        }

    }

    private void showOfficersByLaborClassification() {
        int count = 0;
        System.out.println("Nhập xếp loại lao động: ");
        String laborClassification = scanner.nextLine();
        for (Officer officer : list) {
            if (laborClassification.equalsIgnoreCase(officer.getLaborClassification())) {
                System.out.println("ID: " + officer.getOfficerId() +" " +" "+" " +
                        "Cán bộ: " + officer.getFullName() +" " +" "+" " +
                        "Xếp loại: " + officer.getLaborClassification());
            } else count++;
        }
        if (count == list.size()) {
            System.out.println("Không có cán bộ nào thuộc xếp loại này");
        }

    }

    private int checkId() {
        int countID = 0;
        for (Officer officer : list) {
            if (officer.getOfficerId() > countID) {
                countID = officer.getOfficerId();
            }
        }
        return countID;
    }
}
