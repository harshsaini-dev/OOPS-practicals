package lab04.q15;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q15.HospitalSystemMain

class Employee {
    protected String name;
    private double salary;
    static int count;
    Employee(String name, double salary) {
        this.name = name;
        if (salary < 0) throw new IllegalArgumentException("Negative salary");
        this.salary = salary;
        count++;
    }
    void displayEmployee() {
        System.out.printf("Name: %s, salary: %.2f%n", name, salary);
    }
}
class Doctor extends Employee {
    private String specialization;
    Doctor(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }
    void displayDoctor() {
        displayEmployee();
        System.out.println("Doctor - " + specialization);
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(String name, double salary, String licenseNo) {
        super(name, salary);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        displayEmployee();
        System.out.println("Pharmacist - " + licenseNo);
    }
}
class HospitalSystem {
    void run() {
        Employee[] staff = {
            new Doctor("Dr. Meera", 65000, "General Medicine"),
            new Pharmacist("Aman", 32000, "PH101")
        };
        for (Employee member : staff) {
            if (member instanceof Doctor) ((Doctor) member).displayDoctor();
            else if (member instanceof Pharmacist)
                ((Pharmacist) member).displayPharmacist();
        }
        System.out.println("Total staff: " + Employee.count);
    }
}
public class HospitalSystemMain {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.run();
    }
}
