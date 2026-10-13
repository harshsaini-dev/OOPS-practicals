package lab03.q30;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q30.Lab03Q30

public class Lab03Q30 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 3}, {0, 5, 0}, {7, 0, 0}};
        int zeros = 0, nonzeros = 0;
        for (int[] row : matrix)
            for (int value : row) {
                if (value == 0) zeros++;
                else nonzeros++;
            }
        System.out.println("Zeros: " + zeros);
        System.out.println("Non-zero values: " + nonzeros);
        System.out.println(zeros > nonzeros ? "Sparse matrix" : "Not sparse");
    }
}
