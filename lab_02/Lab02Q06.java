package lab02.q06;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q06.Lab02Q06

import java.util.Scanner;

public class Lab02Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a finite non-negative number:");
        double number = sc.nextDouble();
        if (!Double.isFinite(number) || number < 0) {
            System.out.println("Invalid number");
            return;
        }
        int steps = 0;
        while (number >= 1) {
            number /= 2;
            steps++;
            System.out.println("Step " + steps + ": " + number);
        }
        System.out.println("Steps: " + steps);
    }
}
