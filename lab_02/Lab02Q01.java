package lab02.q01;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q01.Lab02Q01

import java.util.Scanner;

public class Lab02Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides:");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (!Double.isFinite(a + b + c) || a <= 0 || b <= 0 || c <= 0
                || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle");
            return;
        }
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("Area: %.2f%n", area);
    }
}
