package lab01.q17;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q17.Lab01Q17

import java.util.Scanner;

public class Lab01Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        long remaining = (long) number, reversed = 0;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        if (number >= 0 && reversed == (long) number)
            System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}
