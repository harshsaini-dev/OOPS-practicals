package lab03.q14;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q14.Lab03Q14

import java.util.Scanner;

public class Lab03Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] values = new int[2][2][2];
        System.out.println("Enter eight integers:");
        for (int layer = 0; layer < 2; layer++)
            for (int row = 0; row < 2; row++)
                for (int column = 0; column < 2; column++)
                    values[layer][row][column] = sc.nextInt();
        for (int layer = 0; layer < 2; layer++) {
            System.out.println("Layer " + layer + ":");
            for (int[] row : values[layer]) {
                for (int value : row) System.out.printf("%4d", value);
                System.out.println();
            }
        }
    }
}
