package lab02.q03;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q03.Lab02Q03

import java.util.Scanner;

public class Lab02Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2:");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double distance = Math.hypot(x2 - x1, y2 - y1);
        System.out.printf("Distance: %.2f%n", distance);
    }
}
