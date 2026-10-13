package lab04.q10;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q10.HierarchicalStaffMain

class Employee {
    protected String name;
    Employee(String name) { this.name = name; }
    void displayEmployee() { System.out.println("Name: " + name); }
}
class Doctor extends Employee {
    Doctor(String name) { super(name); }
    void displayDoctor() {
        displayEmployee();
        System.out.println("Role: Doctor");
    }
}
class Pharmacist extends Employee {
    Pharmacist(String name) { super(name); }
    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist");
    }
}
public class HierarchicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Meera");
        Pharmacist pharmacist = new Pharmacist("Aman");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}
