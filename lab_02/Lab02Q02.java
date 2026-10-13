package lab02.q02;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q02.Lab02Q02

import java.util.Scanner;

public class Lab02Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal, yearly rate (%), and years:");
        double principal = sc.nextDouble(), rate = sc.nextDouble();
        int years = sc.nextInt();
        if (principal < 0 || rate < 0 || years < 0) {
            System.out.println("Inputs must be non-negative");
            return;
        }
        double amount = principal * Math.pow(1 + rate / 100, years);
        System.out.printf("Amount: %.2f%n", amount);
        System.out.printf("Compound interest: %.2f%n", amount - principal);
    }
}
