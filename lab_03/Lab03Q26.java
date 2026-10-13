package lab03.q26;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q26.Lab03Q26

public class Lab03Q26 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Upper triangular part:");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++)
                System.out.printf("%4d", column >= row ? matrix[row][column] : 0);
            System.out.println();
        }
        System.out.println("Lower triangular part:");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++)
                System.out.printf("%4d", column <= row ? matrix[row][column] : 0);
            System.out.println();
        }
    }
}
