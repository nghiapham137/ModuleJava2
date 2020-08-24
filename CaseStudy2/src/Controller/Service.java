package Controller;

import Models.Officer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service implements I_Service{
    List<Officer> list = new ArrayList<>();
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
        list.add(new Officer(name,sex,homeTown,yearOfBirth,specialize,level,coefficientsSalary,responsibilityAllowance,lunchBenefit,yearOfSalaryIncrease,laborClassification));
        System.out.println("Thêm nhân viên thành công");
    }

    public void showAll() {
        for (Officer officer : list) {
            System.out.println("Nhân viên: " + officer.getFullName() + " ,ID: " + officer.getOfficerId());
        }
    }

    public void search() {
        System.out.println("");
    }

    public void getTotalIncome() {

    }

    public void update() {

    }

    public void remove() {

    }
}
