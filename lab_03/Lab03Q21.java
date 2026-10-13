package lab03.q21;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q21.Lab03Q21

import java.util.Arrays;

public class Lab03Q21 {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        int first = values[0];
        for (int i = 0; i < values.length - 1; i++) values[i] = values[i + 1];
        values[values.length - 1] = first;
        System.out.println("Left rotation: " + Arrays.toString(values));
    }
}
