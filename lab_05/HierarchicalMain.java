package lab05.q14;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q14.HierarchicalMain

class Person {  // Shared super class.
    protected String name;
    protected int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    void displayPerson() { System.out.println(name + " - age " + age); }
}
class Doctor extends Person {
    private String specialization;
    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    void displayDoctor() {
        displayPerson();
        System.out.println("Doctor: " + specialization);
    }
}
class Nurse extends Person {
    private String ward;
    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }
    void displayNurse() {
        displayPerson();
        System.out.println("Nurse ward: " + ward);
    }
}
public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Meera", 35, "General Medicine");
        Nurse nurse = new Nurse("Neha", 28, "Ward A");
        doctor.displayDoctor();
        nurse.displayNurse();
    }
}
