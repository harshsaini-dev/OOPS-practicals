package lab04.q05;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q05.PatientEligibilityMain

class Patient {
    private String name;
    private int age;
    Patient(String name, int age) { this.name = name; this.age = age; }
    void classify() {
        if (age < 0) System.out.println(name + ": invalid age");
        else if (age < 18) System.out.println(name + ": child category");
        else if (age < 60) System.out.println(name + ": adult category");
        else System.out.println(name + ": senior category");
    }
}
public class PatientEligibilityMain {
    public static void main(String[] args) {
        Patient first = new Patient("Aman", 16);
        Patient second = new Patient("Riya", 65);
        first.classify();
        second.classify();
    }
}
