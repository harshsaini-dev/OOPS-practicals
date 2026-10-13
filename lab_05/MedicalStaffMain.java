package lab05.q16;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q16.MedicalStaffMain

class MedicalStaff {
    protected int staffId;
    protected String staffName;
    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}
class Doctor extends MedicalStaff {
    private String specialization;
    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }
    void displayDoctor() {
        System.out.println(staffId + " - " + staffName + " - " + specialization);
    }
}
class Pharmacist extends MedicalStaff {
    private String licenseNo;
    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        System.out.println(staffId + " - " + staffName + " - " + licenseNo);
    }
}
public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(401, "Dr. Meera", "General Medicine");
        Pharmacist pharmacist = new Pharmacist(402, "Aman", "PH401");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}
