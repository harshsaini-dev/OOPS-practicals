package lab02.q14;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q14.Lab02Q14

import java.util.Scanner;

public class Lab02Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before: " + a + " " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("After: " + a + " " + b);
    }
}
