package lab03.q11;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q11.Lab03Q11

public class Lab03Q11 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix[row].length; column++)
                transpose[column][row] = matrix[row][column];
        System.out.println("Transpose:");
        for (int[] row : transpose) {
            for (int value : row) System.out.printf("%4d", value);
            System.out.println();
        }
    }
}
