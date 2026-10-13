package lab01.q19;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q19.Lab01Q19

import java.util.Scanner;

public class Lab01Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator and two numbers:");
        char operator = sc.next().charAt(0);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (operator == '+') System.out.println("Result: " + (a + b));
        else if (operator == '-') System.out.println("Result: " + (a - b));
        else if (operator == '*') System.out.println("Result: " + (a * b));
        else if (operator == '/') {
            if (b == 0) System.out.println("Cannot divide by zero");
            else System.out.println("Result: " + (a / b));
        } else System.out.println("Invalid operator");
    }
}
