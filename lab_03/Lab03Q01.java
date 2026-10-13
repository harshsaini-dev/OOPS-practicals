package lab03.q01;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q01.Lab03Q01

import java.util.Scanner;

public class Lab03Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[5];
        System.out.println("Enter five integers:");
        for (int i = 0; i < values.length; i++) values[i] = sc.nextInt();
        System.out.println("Array:");
        for (int value : values) System.out.print(value + " ");
        System.out.println();
    }
}
