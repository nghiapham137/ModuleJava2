package Models;

public class Officer {
    private static final int BASIC_PAY = 450000;
    private int officerId;
    private String fullName;
    private String sex;
    private String homeTown;
    private int yearOfBirth;
    private String specialize;
    private String level;
    private float coefficientsSalary;
    private float responsibilityAllowance;
    private float lunchBenefit;
    private float salary;
    private int yearOfSalaryIncrease;
    private String laborClassification;
    private int countID = 0;


    public Officer( String fullName, String sex, String homeTown,
                   int yearOfBirth, String specialize, String level, float coefficientsSalary,
                   float responsibilityAllowance, float lunchBenefit, int yearOfSalaryIncrease, String laborClassification ) {
        this.fullName = fullName;
        this.sex = sex;
        this.homeTown = homeTown;
        this.yearOfBirth = yearOfBirth;
        this.specialize = specialize;
        this.level = level;
        this.coefficientsSalary = coefficientsSalary;
        this.responsibilityAllowance = responsibilityAllowance;
        this.lunchBenefit = lunchBenefit;
        this.yearOfSalaryIncrease = yearOfSalaryIncrease;
        this.laborClassification = laborClassification;
        this.officerId = ++this.countID;
        this.salary = (coefficientsSalary + responsibilityAllowance) * BASIC_PAY + lunchBenefit;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public float getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(float coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public float getResponsibilityAllowance() {
        return responsibilityAllowance;
    }

    public void setResponsibilityAllowance(float responsibilityAllowance) {
        this.responsibilityAllowance = responsibilityAllowance;
    }

    public float getLunchBenefit() {
        return lunchBenefit;
    }

    public void setLunchBenefit(float lunchBenefit) {
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

    public float getSalary() {
        return salary ;
    }

    public String toString() {
        return "Nhân viên: " + fullName + "\n"
                + "Id: " + officerId + "\n"
                + "Giới tính: " + sex + "\n"
                + "Quê quán: " + homeTown + "\n"
                + "Năm sinh: " + yearOfBirth + "\n"
                + "Chuyên môn: " + specialize + "\n"
                + "Trình độ:  " + level + "\n"
                + "Hệ số lương: " + coefficientsSalary + "\n"
                + "Phụ cấp trách nhiệm: " + responsibilityAllowance + "\n"
                + "Phụ cấp ăn trưa: " + lunchBenefit + "\n"
                + "Lương tháng: " + salary + "\n"
                + "Năm tăng lương: " + yearOfSalaryIncrease + "\n"
                + "Xếp loại lao động: " + laborClassification;
    }
}
