package lab03.q25;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q25.Lab03Q25

public class Lab03Q25 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        long mainSum = 0, secondarySum = 0;
        for (int i = 0; i < matrix.length; i++) {
            mainSum += matrix[i][i];
            secondarySum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Main diagonal: " + mainSum);
        System.out.println("Secondary diagonal: " + secondarySum);
    }
}
