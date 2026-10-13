package lab05.q06;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q06.MedicineProductMain

class MedicineProduct {
    private String medicineName;
    private String batchNo;
    private double price;
    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }
    public String getMedicineName() { return medicineName; }
    public String getBatchNo() { return batchNo; }
    public double getPrice() { return price; }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public void setBatchNo(String batchNo) { this.batchNo = batchNo; }
    public void setPrice(double price) {
        if (Double.isFinite(price) && price >= 0) this.price = price;
        else System.out.println("Invalid price");
    }
    void displayProduct() {
        System.out.println(medicineName + " - " + batchNo);
        System.out.printf("Price: %.2f%n", price);
    }
}
public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Sample A", "B101", 45);
        product.setPrice(50);
        System.out.println("Getter reads: " + product.getMedicineName());
        product.displayProduct();
    }
}
