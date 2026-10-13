package lab03.q15;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q15.Lab03Q15

public class Lab03Q15 {
    public static void main(String[] args) {
        int[][][] values = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        long sum = 0;
        for (int[][] layer : values)
            for (int[] row : layer)
                for (int value : row) sum += value;
        System.out.println("3-D array sum: " + sum);
    }
}
