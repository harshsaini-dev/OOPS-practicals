package lab05.q07;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q07.PatientValidationMain
// Unique main-class name avoids a second PatientMain.java here.

class Patient {
    private String patientName;
    private int age;
    private double weight;
    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        if (age < 0 || !Double.isFinite(weight) || weight <= 0)
            throw new IllegalArgumentException("Invalid initial patient values");
        this.age = age;
        this.weight = weight;
    }
    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Age rejected: " + age);
    }
    public void setWeight(double weight) {
        if (Double.isFinite(weight) && weight > 0) this.weight = weight;
        else System.out.println("Weight rejected: " + weight);
    }
    void displayPatient() {
        System.out.println(patientName + " - age " + age + ", weight " + weight);
    }
}
public class PatientValidationMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Aman", 20, 55);
        patient.setAge(22);
        patient.setWeight(58);
        patient.setAge(-5);
        patient.setWeight(0);
        patient.displayPatient();
    }
}
