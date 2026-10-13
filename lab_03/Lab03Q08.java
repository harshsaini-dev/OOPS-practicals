package lab03.q08;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q08.Lab03Q08

public class Lab03Q08 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        long sum = 0;
        for (int[] row : matrix)
            for (int value : row) sum += value;
        System.out.println("Matrix sum: " + sum);
    }
}
