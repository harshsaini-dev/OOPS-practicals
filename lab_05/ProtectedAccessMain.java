package lab05.q12;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q12.ProtectedAccessMain

class HospitalStaff {
    protected int staffId;
    protected String staffName;
    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
    protected void displayStaff() {
        System.out.println("Staff: " + staffId + " - " + staffName);
    }
}
class Pharmacist extends HospitalStaff {
    private String licenseNo;
    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);  // Initialize the parent part.
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        System.out.println("Inherited protected data: " + staffId + " - " + staffName);
        displayStaff();
        System.out.println("License: " + licenseNo);
    }
}
public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(101, "Aman", "PH101");
        pharmacist.displayPharmacist();
    }
}
