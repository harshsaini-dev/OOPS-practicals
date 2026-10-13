package lab05.q03;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q03.PharmacyMain

class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount;  // One shared count for the class.
    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }
    void displayPharmacy() {
        System.out.println(pharmacyName + " - " + location);
    }
    static void displayPharmacyCount() {
        System.out.println("Pharmacy count: " + pharmacyCount);
    }
}
public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy first = new Pharmacy("City Pharmacy", "Haridwar");
        Pharmacy second = new Pharmacy("Care Pharmacy", "Roorkee");
        Pharmacy third = new Pharmacy("Health Pharmacy", "Dehradun");
        first.displayPharmacy();
        second.displayPharmacy();
        third.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}
