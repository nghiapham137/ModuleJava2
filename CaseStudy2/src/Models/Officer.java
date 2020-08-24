package Models;

import java.io.Serializable;

public class Officer implements Serializable {
    private static final int BASIC_PAY = 450000;
    private int officerId;
    private String fullName;
    private String gender;
    private String homeTown;
    private int yearOfBirth;
    private String specialize;
    private String level;
    private double coefficientsSalary;
    private double responsibilityAllowance;
    private double lunchBenefit;
    private double salary;
    private int yearOfSalaryIncrease;
    private String laborClassification;



    public Officer(int officerId, String fullName, String gender, String homeTown,
                   int yearOfBirth, String specialize, String level, double coefficientsSalary,
                   double responsibilityAllowance, double lunchBenefit, int yearOfSalaryIncrease, String laborClassification ) {
        this.fullName = fullName;
        this.gender = gender;
        this.homeTown = homeTown;
        this.yearOfBirth = yearOfBirth;
        this.specialize = specialize;
        this.level = level;
        this.coefficientsSalary = coefficientsSalary;
        this.responsibilityAllowance = responsibilityAllowance;
        this.lunchBenefit = lunchBenefit;
        this.yearOfSalaryIncrease = yearOfSalaryIncrease;
        this.laborClassification = laborClassification;
        this.officerId = officerId;
        this.salary = (coefficientsSalary + responsibilityAllowance) * BASIC_PAY + lunchBenefit;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getResponsibilityAllowance() {
        return responsibilityAllowance;
    }

    public void setResponsibilityAllowance(double responsibilityAllowance) {
        this.responsibilityAllowance = responsibilityAllowance;
    }

    public double getLunchBenefit() {
        return lunchBenefit;
    }

    public void setLunchBenefit(double lunchBenefit) {
        this.lunchBenefit = lunchBenefit;
    }

    public int getYearOfSalaryIncrease() {
        return yearOfSalaryIncrease;
    }

    public void setYearOfSalaryIncrease(int yearOfSalaryIncrease) {
        this.yearOfSalaryIncrease = yearOfSalaryIncrease;
    }

    public String getLaborClassification() {
        return laborClassification;
    }

    public void setLaborClassification(String laborClassification) {
        this.laborClassification = laborClassification;
    }


    public int getOfficerId() {
        return officerId;
    }

    public double getSalary() {
        return salary ;
    }

    public String toString() {
        return "Nhân viên: " + fullName + "\n"
                + "Id: " + officerId + "\n"
                + "Giới tính: " + gender + "\n"
                + "Quê quán: " + homeTown + "\n"
                + "Năm sinh: " + yearOfBirth + "\n"
                + "Chuyên môn: " + specialize + "\n"
                + "Trình độ:  " + level + "\n"
                + "Hệ số lương: " + coefficientsSalary + "\n"
                + "Phụ cấp trách nhiệm: " + responsibilityAllowance + "\n"
                + "Phụ cấp ăn trưa: " + lunchBenefit + "\n"
                + "Lương tháng: " + salary + "\n"
                + "Năm tăng lương: " + yearOfSalaryIncrease + "\n"
                + "Xếp loại lao động: " + laborClassification + "\n";
    }
}
