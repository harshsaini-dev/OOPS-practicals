package lab02.q27;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q27.Lab02Q27

import java.util.Scanner;

public class Lab02Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade A-F:");
        char grade = Character.toUpperCase(sc.next().charAt(0));
        switch (grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Satisfactory"); break;
            case 'D': System.out.println("Needs improvement"); break;
            case 'E': System.out.println("Poor"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid grade");
        }
    }
}
