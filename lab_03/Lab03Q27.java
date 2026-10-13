package lab03.q27;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q27.Lab03Q27

public class Lab03Q27 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println("Boundary elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row == 0 || row == matrix.length - 1 || column == 0
                        || column == matrix[row].length - 1)
                    System.out.printf("%4d", matrix[row][column]);
                else System.out.print("    ");
            }
            System.out.println();
        }
    }
}
