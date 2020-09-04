package Models;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double basicPay;
    private double fine;


    public FullTimeEmployee(String id, String fullName, int age, int phoneNumber, String email, double basicPay, double bonus, double fine) {
        super(id, fullName, age, phoneNumber, email);
        this.basicPay = basicPay;
        this.bonus = bonus;
        this.fine = fine;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return  basicPay + (bonus - fine);
    }

    public String toString() {
        return "Nhân viên full time: " + "\n"
                + "ID: " + getId() + "\n"
                + "Họ tên: " + getFullName() + "\n"
                + "Tuổi: " + getAge() + "\n"
                + "Số điện thoại: " + getPhoneNumber() + "\n"
                + "Email: " + getEmail() + "\n"
                + "Lương cứng: " + basicPay + "\n"
                + "Tiền thưởng: " + bonus + "\n"
                + "Tiền phạt: " + fine + "\n";
    }
}
