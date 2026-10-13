package lab02.q17;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q17.Lab02Q17

import java.util.Scanner;

public class Lab02Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        int rotated = (number << 2) | (number >>> 30);
        System.out.println("Before (32 bits): " + String.format("%32s",
                Integer.toBinaryString(number)).replace(' ', '0'));
        System.out.println("After  (32 bits): " + String.format("%32s",
                Integer.toBinaryString(rotated)).replace(' ', '0'));
        System.out.println("Rotated signed int: " + rotated);
    }
}
