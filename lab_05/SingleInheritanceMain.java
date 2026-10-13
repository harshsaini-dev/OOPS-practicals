package lab05.q13;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q13.SingleInheritanceMain

class Employee {  // Super class.
    protected int employeeId;
    protected String employeeName;
    protected double salary;
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    void displayEmployee() {
        System.out.println(employeeId + " - " + employeeName);
        System.out.printf("Salary: %.2f%n", salary);
    }
}
class Pharmacist extends Employee {  // Child class.
    private String licenseNo;
    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        displayEmployee();
        System.out.println("License: " + licenseNo);
    }
}
public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(201, "Riya", 35000, "PH202");
        pharmacist.displayPharmacist();
    }
}
