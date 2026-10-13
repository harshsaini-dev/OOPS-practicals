package lab02.q08;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q08.Lab02Q08

import java.util.Scanner;

public class Lab02Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three angles in degrees:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && (long) a + b + c == 180)
            System.out.println("Valid triangle");
        else System.out.println("Invalid triangle");
    }
}
