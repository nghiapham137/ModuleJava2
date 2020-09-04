package Models;

public class PartTimeEmployee extends Employee{
    private double workingTime;

    public PartTimeEmployee(String id, String fullName, int age, int phoneNumber, String email, double workingTime) {
        super(id, fullName, age, phoneNumber, email);
        this.workingTime = workingTime;
    }

    public double getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }

    public double getSalary() {

        return workingTime * 100000;
    }

    public String toString() {
        return "Nhân viên part time: " + "\n"
                + "ID: " + getId() + "\n"
                + "Họ tên: " + getFullName() + "\n"
                + "Tuổi: " + getAge() + "\n"
                + "Số điện thoại: " + getPhoneNumber() + "\n"
                + "Email: " + getEmail() + "\n"
                + "Số giờ làm việc: " + workingTime + "\n";
    }
}
