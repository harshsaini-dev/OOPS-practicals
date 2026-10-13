package lab04.q06;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q06.EncapsulatedMedicineMain

class MedicineProduct {
    private String name;
    private double price;
    MedicineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void displayProduct() {
        System.out.println("Product: " + name);
        System.out.printf("Price: %.2f%n", price);
    }
}
public class EncapsulatedMedicineMain {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Sample A", 60);
        product.displayProduct();
    }
}
