package lab02.q16;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q16.Lab02Q16

import java.util.Scanner;

public class Lab02Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter non-negative int and exponent (0-30):");
        int number = sc.nextInt(), exponent = sc.nextInt();
        if (number < 0 || exponent < 0 || exponent > 30) {
            System.out.println("Invalid input");
            return;
        }
        long product = ((long) number) << exponent;
        int quotient = number >> exponent;
        System.out.println("Multiply by 2^k: " + product);
        System.out.println("Divide by 2^k: " + quotient);
    }
}
