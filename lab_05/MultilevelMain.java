package lab05.q15;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q15.MultilevelMain

class Person {  // Top-level super class.
    protected String name;
    protected int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    void displayPerson() { System.out.println(name + " - age " + age); }
}
class Employee extends Person {  // Child of Person; parent of Manager.
    private int employeeId;
    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
    int getEmployeeId() { return employeeId; }
}
class Manager extends Employee {  // Final child in this chain.
    private int teamSize;
    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }
    void displayManager() {
        displayPerson();
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team size: " + teamSize);
    }
}
public class MultilevelMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Kabir", 38, 301, 6);
        manager.displayManager();
    }
}
