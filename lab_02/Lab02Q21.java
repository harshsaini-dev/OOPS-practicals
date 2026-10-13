package lab02.q21;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q21.Lab02Q21

import java.util.Scanner;

public class Lab02Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();
        if (number <= 0) { System.out.println("Invalid input"); return; }
        System.out.println("Factors:");
        long divisor = 1;
        do {
            if (number % divisor == 0) System.out.print(divisor + " ");
            divisor++;
        } while (divisor <= number);
        System.out.println();
    }
}
