package lab04.q03;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q03.PharmacyMain

class Pharmacy {
    static String pharmacyName = "City Pharmacy";
    static String location = "Haridwar";  // Shared by every object.
    private String counter;
    Pharmacy(String counter) { this.counter = counter; }
    static void updateLocation(String location) {
        Pharmacy.location = location;
    }
    void display() {
        System.out.println(counter + ": " + pharmacyName + ", " + location);
    }
}
public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy first = new Pharmacy("Counter A");
        Pharmacy second = new Pharmacy("Counter B");
        first.display();
        second.display();
        Pharmacy.updateLocation("Roorkee");
        first.display();
        second.display();
    }
}
