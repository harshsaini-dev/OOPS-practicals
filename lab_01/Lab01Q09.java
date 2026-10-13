package lab01.q09;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q09.Lab01Q09

import java.util.Scanner;

public class Lab01Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three subject marks out of 100:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100) {
            System.out.println("Invalid marks");
            return;
        }
        int total = a + b + c;
        double percentage = total / 3.0;
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        if (a >= 40 && b >= 40 && c >= 40) System.out.println("Pass");
        else System.out.println("Fail");
    }
}
