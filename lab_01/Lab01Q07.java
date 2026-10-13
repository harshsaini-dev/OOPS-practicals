package lab01.q07;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q07.Lab01Q07

import java.util.Scanner;

public class Lab01Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("Divisible by both 3 and 5");
        else System.out.println("Not divisible by both 3 and 5");
    }
}
