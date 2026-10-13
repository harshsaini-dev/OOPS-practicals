package lab01.q04;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q04.Lab01Q04

import java.util.Scanner;

public class Lab01Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }
}
