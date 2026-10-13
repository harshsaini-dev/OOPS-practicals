package lab01.q15;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q15.Lab01Q15

import java.util.Scanner;

public class Lab01Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-digit number:");
        int number = sc.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Input must have three digits");
            return;
        }
        int a = number / 100, b = (number / 10) % 10, c = number % 10;
        int sum = a * a * a + b * b * b + c * c * c;
        if (sum == number) System.out.println("Armstrong number");
        else System.out.println("Not an Armstrong number");
    }
}
