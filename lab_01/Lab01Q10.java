package lab01.q10;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q10.Lab01Q10

import java.util.Scanner;

public class Lab01Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b) System.out.println("Greatest: " + a);
        else if (b > a) System.out.println("Greatest: " + b);
        else System.out.println("Both numbers are equal: " + a);
    }
}
