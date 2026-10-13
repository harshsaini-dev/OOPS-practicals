package lab05.q19;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q19.HospitalStaffMain

class Person {  // Top-level super class.
    protected String name;
    protected int age;
    Person(String name, int age) { this.name = name; this.age = age; }
}
class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount;
    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        setSalary(salary);
        employeeCount++;
    }
    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setSalary(double salary) {
        if (Double.isFinite(salary) && salary >= 0) this.salary = salary;
        else System.out.println("Invalid salary rejected");
    }
    void displayEmployee() {
        System.out.printf("ID %d: %s, age %d, salary %.2f%n",
                getEmployeeId(), name, age, getSalary());
    }
}
class Doctor extends Employee {
    private String specialization;
    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }
    void displayDoctor() {
        displayEmployee();
        System.out.println("Doctor - " + specialization);
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        displayEmployee();
        System.out.println("Pharmacist - " + licenseNo);
    }
}
class StaffManager {
    void displayStaff(Employee[] staff) {
        double totalSalary = 0;  // Local total belongs to this processing call.
        for (int i = 0; i < staff.length; i++) {
            Employee employee = staff[i];
            if (employee instanceof Doctor) ((Doctor) employee).displayDoctor();
            else if (employee instanceof Pharmacist)
                ((Pharmacist) employee).displayPharmacist();
            totalSalary += employee.getSalary();
        }
        System.out.println("Employee count: " + Employee.employeeCount);
        System.out.printf("Total salary: %.2f%n", totalSalary);
    }
}
public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Meera", 35, 501, 65000, "General Medicine"),
            new Pharmacist("Aman", 27, 502, 32000, "PH501")
        };
        staff[1].setSalary(35000);
        staff[1].setSalary(-100);
        StaffManager manager = new StaffManager();
        manager.displayStaff(staff);
    }
}
