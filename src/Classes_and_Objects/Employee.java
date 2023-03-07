package Classes_and_Objects;

public class Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean martialStatus;

    void displayEmployeeStatus() {
        System.out.println("Employee Details");
        System.out.println("================");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Marital Status: " + martialStatus);
    }

    public static void main(String[] args) {
        Employee objEmp = new Employee();
        // Invoke the displayEmployeeDetails
        objEmp.displayEmployeeStatus();
    }
}
