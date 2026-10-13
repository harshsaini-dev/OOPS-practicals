package lab03.q23;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q23.Lab03Q23

public class Lab03Q23 {
    public static void main(String[] args) {
        int[] values = {9, 9, 7, 5, 3};
        int largest = values[0];
        for (int value : values) if (value > largest) largest = value;
        int second = 0;
        boolean found = false;
        for (int value : values) {
            if (value < largest && (!found || value > second)) {
                second = value;
                found = true;
            }
        }
        if (found) System.out.println("Second distinct largest: " + second);
        else System.out.println("No second distinct largest value");
    }
}
