package lab01.q12;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q12.Lab01Q12

import java.util.Scanner;

public class Lab01Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive year:");
        int year = sc.nextInt();
        if (year <= 0) System.out.println("Invalid year");
        else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap year");
        else System.out.println("Not a leap year");
    }
}
