package lab01.q02;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q02.Lab01Q02

import java.util.Scanner;

public class Lab01Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Addition: " + ((long) a + b));
        System.out.println("Subtraction: " + ((long) a - b));
        System.out.println("Multiplication: " + ((long) a * b));
        if (b == 0) {
            System.out.println("Division and modulus undefined for zero divisor.");
        } else {
            System.out.println("Division: " + ((double) a / b));
            System.out.println("Modulus: " + (a % b));
        }
    }
}
