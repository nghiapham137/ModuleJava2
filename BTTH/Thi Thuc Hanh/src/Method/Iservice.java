package Method;

import Models.Employee;

public interface Iservice {
    void addEmployee(Employee employee);
    void showAllEmployees();
    void getEmployeeSalary();
    void getEmployeeWithLowPay();
    void sortingBySalary();
}
