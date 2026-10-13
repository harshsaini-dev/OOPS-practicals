package lab01.q16;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q16.Lab01Q16

import java.util.Scanner;

public class Lab01Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter annual salary:");
        double salary = sc.nextDouble();
        if (!Double.isFinite(salary) || salary < 0) {
            System.out.println("Invalid salary");
            return;
        }
        double rate;
        if (salary <= 250000) rate = 0;
        else if (salary <= 500000) rate = 0.05;
        else if (salary <= 1000000) rate = 0.20;
        else rate = 0.30;
        double tax = salary * rate;
        System.out.printf("Selected exercise rate: %.0f%%%n", rate * 100);
        System.out.printf("Tax: %.2f%n", tax);
    }
}
