package lab03.q16;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q16.Lab03Q16

public class Lab03Q16 {
    public static void main(String[] args) {
        int[][][] values = {{{1, -2}, {0, 4}}, {{-5, 6}, {-7, 0}}};
        int positive = 0, negative = 0, zeros = 0;
        for (int[][] layer : values)
            for (int[] row : layer)
                for (int value : row) {
                    if (value > 0) positive++;
                    else if (value < 0) negative++;
                    else zeros++;
                }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zeros);
    }
}
