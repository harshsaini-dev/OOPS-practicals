package lab03.q09;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q09.Lab03Q09

public class Lab03Q09 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int row = 0; row < matrix.length; row++) {
            long sum = 0;
            for (int value : matrix[row]) sum += value;
            System.out.println("Row " + (row + 1) + " sum: " + sum);
        }
    }
}
