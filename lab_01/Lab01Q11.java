package lab01.q11;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q11.Lab01Q11

import java.util.Scanner;

public class Lab01Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int largest;
        if (a >= b) {
            if (a >= c) largest = a;
            else largest = c;
        } else {
            if (b >= c) largest = b;
            else largest = c;
        }
        System.out.println("Largest: " + largest);
    }
}
