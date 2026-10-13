package lab02.q09;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q09.Lab02Q09

import java.util.Scanner;

public class Lab02Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String first = sc.nextLine();
        System.out.println("Enter second string:");
        String second = sc.nextLine();
        int order = 0;
        int common = Math.min(first.length(), second.length());
        for (int i = 0; i < common; i++) {
            if (first.charAt(i) < second.charAt(i)) { order = -1; break; }
            if (first.charAt(i) > second.charAt(i)) { order = 1; break; }
        }
        if (order == 0) {
            if (first.length() < second.length()) order = -1;
            else if (first.length() > second.length()) order = 1;
        }
        if (order < 0) System.out.println("First string comes before second");
        else if (order > 0) System.out.println("First string comes after second");
        else System.out.println("Strings are equal");
    }
}
