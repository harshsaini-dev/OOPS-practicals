package lab03.q28;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q28.Lab03Q28

import java.util.Scanner;

public class Lab03Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 5, 9}};
        System.out.println("Enter search value:");
        int target = sc.nextInt();
        boolean found = false;
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix[row].length; column++)
                if (matrix[row][column] == target) {
                    System.out.printf("Found at row %d, column %d (1-based)%n",
                            row + 1, column + 1);
                    found = true;
                }
        if (!found) System.out.println("Not found");
    }
}
