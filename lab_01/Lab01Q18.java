package lab01.q18;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q18.Lab01Q18

import java.util.Scanner;

public class Lab01Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        boolean prime = number >= 2;
        for (int divisor = 2; prime && divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) prime = false;
        }
        if (prime) System.out.println("Prime");
        else System.out.println("Not prime");
    }
}
