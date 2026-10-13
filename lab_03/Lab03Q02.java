package lab03.q02;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q02.Lab03Q02

import java.util.Scanner;

public class Lab03Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[10];
        System.out.println("Enter ten integers:");
        for (int i = 0; i < values.length; i++) values[i] = sc.nextInt();
        System.out.println("Reverse order:");
        for (int i = values.length - 1; i >= 0; i--)
            System.out.print(values[i] + " ");
        System.out.println();
    }
}
