package lab02.q15;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q15.Lab02Q15

import java.util.Scanner;

public class Lab02Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt(), value = number, count = 0;
        while (value != 0) {
            count += value & 1;
            value >>>= 1;
        }
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Set bits: " + count);
    }
}
