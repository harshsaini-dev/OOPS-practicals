package lab05.q02;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q02.MedicineMain

class Medicine {
    String medicineName;
    String batchNo;
    double price;
    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }
    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + ", batch: " + batchNo);
        System.out.printf("Price: %.2f%n", price);
    }
}
public class MedicineMain {
    public static void main(String[] args) {
        Medicine first = new Medicine("Sample A", "B101", 45);
        Medicine second = new Medicine("Sample B", "B102", 60);
        first.displayMedicine();
        second.displayMedicine();
    }
}
