package lab03.q13;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q13.Lab03Q13

public class Lab03Q13 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        long[][] product = new long[3][3];
        for (int row = 0; row < 3; row++)
            for (int column = 0; column < 3; column++)
                for (int k = 0; k < 3; k++)
                    product[row][column] += (long) a[row][k] * b[k][column];
        System.out.println("Matrix product:");
        for (long[] row : product) {
            for (long value : row) System.out.printf("%5d", value);
            System.out.println();
        }
    }
}
