package lab03.q29;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q29.Lab03Q29

import java.util.Arrays;

public class Lab03Q29 {
    public static void main(String[] args) {
        int[][] jagged = {{9, 2}, {7, 1, 5}, {8, 3, 6, 4}};
        for (int[] row : jagged) Arrays.sort(row);
        System.out.println("Sorted rows:");
        for (int[] row : jagged) System.out.println(Arrays.toString(row));
    }
}
