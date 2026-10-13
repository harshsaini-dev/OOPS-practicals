package lab01.q06;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q06.Lab01Q06

import java.util.Scanner;

public class Lab01Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        if (ch <= 127) System.out.println("ASCII value: " + (int) ch);
        else System.out.println("Not an ASCII character; UTF-16 value: " + (int) ch);
    }
}
