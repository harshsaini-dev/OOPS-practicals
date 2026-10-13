package lab05.q09;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q09.PublicAccessMain

class Hospital {
    // Public members are accessible wherever this class is accessible.
    public String hospitalName;
    public String hospitalCode;
    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "H101";
    }
    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName + " (" + hospitalCode + ")");
    }
}
public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        System.out.println("Direct name: " + hospital.hospitalName);
        System.out.println("Direct code: " + hospital.hospitalCode);
        hospital.displayHospital();
    }
}
