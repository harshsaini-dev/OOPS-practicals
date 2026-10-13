package lab04.q11;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q11.MultilevelStaffMain

class Person {
    protected String name;
    Person(String name) { this.name = name; }
    void displayName() { System.out.println("Name: " + name); }
}
class Employee extends Person {
    private int employeeId;
    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }
    void displayEmployeeId() { System.out.println("Employee ID: " + employeeId); }
}
class Manager extends Employee {
    private int teamSize;
    Manager(String name, int employeeId, int teamSize) {
        super(name, employeeId);
        this.teamSize = teamSize;
    }
    void displayManager() {
        displayName();
        displayEmployeeId();
        System.out.println("Team size: " + teamSize);
    }
}
public class MultilevelStaffMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Kabir", 201, 5);
        manager.displayManager();
    }
}
