package lab04.q02;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q02.MedicineMain

class Medicine {
    String name;
    double price;
    Medicine(String name, double price) {
        this.name = name;  // this refers to the current object.
        this.price = price;
    }
    void display() {
        System.out.println("Medicine: " + name);
        System.out.printf("Price: %.2f%n", price);
    }
}
public class MedicineMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Sample Medicine", 45.0);
        medicine.display();
    }
}
