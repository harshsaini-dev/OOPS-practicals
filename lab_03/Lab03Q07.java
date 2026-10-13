package lab03.q07;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q07.Lab03Q07

import java.util.Scanner;

public class Lab03Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter nine integers for a 3 x 3 matrix:");
        for (int row = 0; row < 3; row++)
            for (int column = 0; column < 3; column++)
                matrix[row][column] = sc.nextInt();
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) System.out.printf("%4d", value);
            System.out.println();
        }
    }
}
