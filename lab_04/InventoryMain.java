package lab04.q04;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q04.InventoryMain

class MedicineStock {
    private String name;
    private int quantity;
    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    void display() {
        System.out.println(name + " - quantity: " + quantity);
    }
}
class Inventory {
    private MedicineStock[] stocks = {
        new MedicineStock("Sample A", 20),
        new MedicineStock("Sample B", 35),
        new MedicineStock("Sample C", 15)
    };
    void displayInventory() {
        for (MedicineStock stock : stocks) stock.display();
    }
}
public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }
}
