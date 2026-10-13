package lab01.q05;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q05.Lab01Q05

import java.util.Scanner;

public class Lab01Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating-point value:");
        double value = sc.nextDouble();
        int converted = (int) value;
        System.out.println("Original: " + value);
        System.out.println("Converted integer: " + converted);
    }
}
