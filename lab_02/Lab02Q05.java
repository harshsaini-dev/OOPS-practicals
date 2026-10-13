package lab02.q05;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q05.Lab02Q05

import java.util.Scanner;

public class Lab02Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        long negative = -(long) number;
        System.out.println("Unary negation: " + negative);
    }
}
