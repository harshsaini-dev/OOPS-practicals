package lab01.q03;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q03.Lab01Q03

import java.util.Scanner;

public class Lab01Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        if (number % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
