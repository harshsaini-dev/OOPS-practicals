package lab01.q14;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q14.Lab01Q14

import java.util.Scanner;

public class Lab01Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        if (Character.isDigit(ch)) System.out.println("Digit");
        else if (Character.isUpperCase(ch)) System.out.println("Uppercase letter");
        else if (Character.isLowerCase(ch)) System.out.println("Lowercase letter");
        else System.out.println("Special character");
    }
}
