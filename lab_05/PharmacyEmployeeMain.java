package lab05.q20;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q20.PharmacyEmployeeMain

class Employee {  // Super class with encapsulated data.
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount;  // Shared class variable.
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setSalary(double salary) {
        if (Double.isFinite(salary) && salary >= 0) this.salary = salary;
        else System.out.println("Negative or invalid salary rejected");
    }
    protected void displayBasic() {  // Useful inherited display behaviour.
        System.out.printf("ID %d: %s, salary %.2f%n",
                getEmployeeId(), getEmployeeName(), getSalary());
    }
    void displayPolicy() {  // Default/package-private method.
        System.out.println("Salary changes must use setSalary().");
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        displayBasic();
        System.out.println("Pharmacist license: " + licenseNo);
    }
}
class StoreManager extends Employee {
    private int storeSection;
    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }
    void displayManager() {
        displayBasic();
        System.out.println("Manager section: " + storeSection);
    }
}
class PharmacyEmployeeManager {
    void processEmployees(Employee[] employees) {
        double total = 0;  // Local variable used only during this call.
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee instanceof Pharmacist)
                ((Pharmacist) employee).displayPharmacist();
            else if (employee instanceof StoreManager)
                ((StoreManager) employee).displayManager();
            employee.displayPolicy();
            total += employee.getSalary();
        }
        System.out.println("Employee count: " + Employee.employeeCount);
        System.out.printf("Total salary: %.2f%n", total);
    }
}
public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(601, "Riya", 32000, "PH601"),
            new StoreManager(602, "Kabir", 42000, 2)
        };
        employees[0].setSalary(34000);
        employees[0].setSalary(-500);
        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.processEmployees(employees);
    }
}
