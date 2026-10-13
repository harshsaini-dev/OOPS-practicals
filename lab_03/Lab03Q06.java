package lab03.q06;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q06.Lab03Q06

import java.util.Arrays;

public class Lab03Q06 {
    public static void main(String[] args) {
        int[] original = {5, 10, 15, 20};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) copy[i] = original[i];
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
        copy[0] = 99;
        System.out.println("After changing copy: " + Arrays.toString(copy));
        System.out.println("Original remains: " + Arrays.toString(original));
    }
}
