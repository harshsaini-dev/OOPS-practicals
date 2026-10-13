package lab02.q10;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q10.Lab02Q10

import java.util.Scanner;

public class Lab02Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year, range start, range end:");
        int year = sc.nextInt(), start = sc.nextInt(), end = sc.nextInt();
        if (start > end || start <= 0) {
            System.out.println("Invalid range");
            return;
        }
        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (leap && year >= start && year <= end)
            System.out.println("Leap year within range");
        else System.out.println("Condition not satisfied");
    }
}
