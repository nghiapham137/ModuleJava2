package Method;

import IOManager.IOManagerment;
import Models.Employee;
import Models.FullTimeEmployee;
import Models.FullTimeEmployeeComparator;
import Models.PartTimeEmployee;
import View.EmployeeType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service implements Iservice {

    public static List<Employee> list = new ArrayList<>();
    int count;


    @Override
    public void addEmployee(Employee employee) {
        list.add(employee);
        IOManagerment.writeToFile(list);
    }

    @Override
    public void showAllEmployees() {
        for (Employee e : list){
            System.out.println(e);
        }
    }

    @Override
    public void getEmployeeSalary() {
        if (EmployeeType.getEmployeeType().equalsIgnoreCase("Full time"))
            getFullTimeEmployeeSalary();
        else getPartTimeEmployeeSalary();
    }

    @Override
    public void getEmployeeWithLowPay() {
        System.out.println("Mức lương trung bình của nhân viên full time:" + getAverageSalary());
        for (Employee e : list) {
            if (e instanceof FullTimeEmployee) {
                if (e.getSalary() < getAverageSalary()) {
                    System.out.println("Nhân viên:" + e.getFullName() + "\n" + "Lương: " + e.getSalary());
                }
            }
        }
    }

    @Override
    public void sortingBySalary() {
        List<FullTimeEmployee> fullTimeEmployeeList = new ArrayList<>();
        for (Employee e : list) {
            if (e instanceof FullTimeEmployee) {
                fullTimeEmployeeList.add((FullTimeEmployee)e);
            }
        }
        if (fullTimeEmployeeList.size()== 0) {
            System.out.println("Không có nhân viên nào");
        }else {
            fullTimeEmployeeList.sort(new FullTimeEmployeeComparator());
            for (FullTimeEmployee e : fullTimeEmployeeList) {
                System.out.println("Nhân viên: " + e.getFullName() + "\n" + "Lương thực lĩnh: " + e.getSalary());
            }
        }
    }

    private void getFullTimeEmployeeSalary() {
        for (Employee e : list) {
            if (e instanceof FullTimeEmployee){
                System.out.println("Tên nhân viên: " + e.getFullName() + "\n" + "Lương thực lĩnh: " + e.getSalary());
            }
        }
    }

    private void getPartTimeEmployeeSalary() {
        for (Employee e : list) {
            if (e instanceof PartTimeEmployee) {
                System.out.println("Tên nhân viên: " + e.getFullName() + "\n" + "Lương thực lĩnh: " + e.getSalary());
            }
        }
    }

    private double getTotalSalary() {
        double totalSalary = 0;

        for (Employee e : list) {
            if (e instanceof FullTimeEmployee) {
                totalSalary += e.getSalary();
                count++;
            }
        }
        return totalSalary;
    }

    private double getAverageSalary() {
        return getTotalSalary()/count;
    }
}
