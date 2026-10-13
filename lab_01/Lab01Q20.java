package lab01.q20;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q20.Lab01Q20

import java.util.Scanner;

public class Lab01Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age and gender (male/female):");
        int age = sc.nextInt();
        String gender = sc.next().toLowerCase();
        if (age < 0) System.out.println("Invalid age");
        else if (gender.equals("male")) {
            if (age >= 21) System.out.println("Eligible by the given age rule");
            else System.out.println("Not eligible by the given age rule");
        } else if (gender.equals("female")) {
            if (age >= 18) System.out.println("Eligible by the given age rule");
            else System.out.println("Not eligible by the given age rule");
        } else System.out.println("Use male or female for this exercise");
    }
}
