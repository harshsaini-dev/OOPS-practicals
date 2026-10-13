package lab04.q08;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q08.PatientBillMain

class PatientBill {
    private double consultationFee;
    private double medicineFee;
    void setConsultationFee(double fee) {
        if (Double.isFinite(fee) && fee >= 0) this.consultationFee = fee;
        else System.out.println("Invalid consultation fee");
    }
    void setMedicineFee(double fee) {
        if (Double.isFinite(fee) && fee >= 0) this.medicineFee = fee;
        else System.out.println("Invalid medicine fee");
    }
    double calculateTotal() { return consultationFee + medicineFee; }
    void displayBill() { System.out.printf("Total bill: %.2f%n", calculateTotal()); }
}
public class PatientBillMain {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setConsultationFee(300);
        bill.setMedicineFee(150);
        bill.displayBill();
    }
}
