package lab03.q10;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q10.Lab03Q10

public class Lab03Q10 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int column = 0; column < matrix[0].length; column++) {
            long sum = 0;
            for (int row = 0; row < matrix.length; row++)
                sum += matrix[row][column];
            System.out.println("Column " + (column + 1) + " sum: " + sum);
        }
    }
}
