package lab02.q30;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q30.Lab02Q30

import java.util.Scanner;

public class Lab02Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();
        int shifted = number;
        while (shifted > 1 && (shifted & 3) == 0) shifted >>= 2;
        System.out.println("Power of 4: " + (number > 0 && shifted == 1));
        int toggled = number ^ (1 << 2);  // Third bit, counted from 1 at the LSB.
        System.out.println("After toggling third bit: " + toggled);
        System.out.println("Table of original number (up to 20 terms):");
        for (int i = 1; i <= 20; i++) {
            long product = (long) number * i;
            // Check break first because multiples of 48 are also multiples of 6.
            if (product % 48 == 0) {
                System.out.println("Stopped before multiple of 48: " + product);
                break;
            }
            if (product % 6 == 0) continue;
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}
