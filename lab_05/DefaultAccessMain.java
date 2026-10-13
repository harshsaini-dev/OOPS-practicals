package lab05.q11;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q11.DefaultAccessMain

class Pharmacy {
    String medicineName;  // Default/package-private field.
    double price;        // No access keyword.
    Pharmacy() {         // Default-access constructor.
        medicineName = "Sample A";
        price = 45;
    }
    void displayMedicine() {  // Default-access method.
        System.out.println(medicineName + " - price " + price);
    }
}
public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        // Both classes are in the same package.
        System.out.println("Direct medicine: " + pharmacy.medicineName);
        System.out.println("Direct price: " + pharmacy.price);
        pharmacy.displayMedicine();
    }
}
