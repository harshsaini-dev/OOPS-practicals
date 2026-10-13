package lab02.q24;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q24.Lab02Q24

public class Lab02Q24 {
    public static void main(String[] args) {
        int[] values = {12, -3, 25, 7, 0};
        int minimum = values[0], maximum = values[0];
        for (int value : values) {
            if (value < minimum) minimum = value;
            if (value > maximum) maximum = value;
        }
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}
