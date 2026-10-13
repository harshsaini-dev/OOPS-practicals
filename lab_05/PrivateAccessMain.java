package lab05.q10;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q10.PrivateAccessMain

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public void displayEmployee() {
        System.out.println(employeeId + " - " + employeeName);
        System.out.printf("Salary: %.2f%n", salary);
    }
}
public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Riya", 32000);
        // System.out.println(employee.salary); // Illegal: salary is private.
        System.out.println("Getter ID: " + employee.getEmployeeId());
        System.out.println("Getter name: " + employee.getEmployeeName());
        System.out.println("Getter salary: " + employee.getSalary());
        employee.displayEmployee();
    }
}
