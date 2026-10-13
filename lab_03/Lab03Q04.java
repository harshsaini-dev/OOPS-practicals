package lab03.q04;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q04.Lab03Q04

public class Lab03Q04 {
    public static void main(String[] args) {
        int[] values = {-8, -3, -12, -5};
        int maximum = values[0];
        for (int value : values) if (value > maximum) maximum = value;
        System.out.println("Maximum: " + maximum);
    }
}
