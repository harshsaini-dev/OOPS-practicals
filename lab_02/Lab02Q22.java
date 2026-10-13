package lab02.q22;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q22.Lab02Q22

import java.util.Scanner;

public class Lab02Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        long value = Math.abs((long) number), reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        if (number < 0) reversed = -reversed;
        System.out.println("Reversed: " + reversed);
    }
}
