package lab05.q04;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q04.PatientMain

class Patient {
    int patientId;
    String patientName;
    int age;
    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }
    void displayPatient() {
        System.out.println(patientId + " - " + patientName + " - age " + age);
    }
}
class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {  // Local loop variable.
            patients[i].displayPatient();
        }
    }
}
public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Aman", 21), new Patient(2, "Riya", 25),
            new Patient(3, "Kabir", 31), new Patient(4, "Neha", 19),
            new Patient(5, "Dev", 40)
        };
        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
