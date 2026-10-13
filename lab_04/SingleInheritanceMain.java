package lab04.q09;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q09.SingleInheritanceMain

class Employee {
    protected String name;
    Employee(String name) { this.name = name; }
    void displayEmployee() { System.out.println("Employee: " + name); }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(String name, String licenseNo) {
        super(name);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        displayEmployee();
        System.out.println("License: " + licenseNo);
    }
}
public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist("Riya", "PH101");
        pharmacist.displayPharmacist();
    }
}
