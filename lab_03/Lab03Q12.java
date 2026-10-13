package lab03.q12;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q12.Lab03Q12

public class Lab03Q12 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[a.length][a[0].length];
        for (int row = 0; row < a.length; row++)
            for (int column = 0; column < a[row].length; column++)
                sum[row][column] = a[row][column] + b[row][column];
        System.out.println("Matrix sum:");
        for (int[] row : sum) {
            for (int value : row) System.out.printf("%4d", value);
            System.out.println();
        }
    }
}
