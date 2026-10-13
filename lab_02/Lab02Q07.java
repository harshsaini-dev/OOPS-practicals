package lab02.q07;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q07.Lab02Q07

import java.util.Scanner;

public class Lab02Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.println("Enter rainfall for seven days (mm):");
        for (int day = 1; day <= 7; day++) {
            double rainfall = sc.nextDouble();
            if (rainfall < 0) {
                System.out.println("Rainfall cannot be negative");
                return;
            }
            total += rainfall;
        }
        System.out.printf("Total rainfall: %.2f mm%n", total);
    }
}
