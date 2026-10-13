package lab05.q05;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q05.EligibilityMain

class Medicine {
    String medicineName;
    int ageLimit;
    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }
    String checkEligibility(int patientAge) {
        String result;  // Local result is returned to the caller.
        if (patientAge >= ageLimit) result = "Eligible";
        else result = "Not Eligible";
        return result;
    }
    void displayEligibility(int patientAge) {
        System.out.println(medicineName + ", age " + patientAge + ": "
                + checkEligibility(patientAge));
    }
}
public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Sample Medicine", 18);
        medicine.displayEligibility(12);
        medicine.displayEligibility(20);
    }
}
