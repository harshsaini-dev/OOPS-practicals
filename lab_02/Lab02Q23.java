package lab02.q23;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q23.Lab02Q23

import java.util.Scanner;

public class Lab02Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        long remaining = number, reversed = 0;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        System.out.println(number >= 0 && reversed == number
                ? "Palindrome" : "Not a palindrome");
    }
}
