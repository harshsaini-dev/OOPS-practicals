package lab02.q11;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q11.Lab02Q11

import java.util.Scanner;

public class Lab02Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter theory and practical percentages:");
        double theory = sc.nextDouble(), practical = sc.nextDouble();
        if (theory < 0 || theory > 100 || practical < 0 || practical > 100) {
            System.out.println("Invalid percentages");
            return;
        }
        double overall = (theory + practical) / 2;
        boolean pass = (theory >= 40 && practical >= 50) || overall >= 50;
        System.out.printf("Overall: %.2f%%%n", overall);
        System.out.println(pass ? "Pass" : "Fail");
    }
}
