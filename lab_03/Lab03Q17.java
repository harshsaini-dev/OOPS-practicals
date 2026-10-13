package lab03.q17;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q17.Lab03Q17

public class Lab03Q17 {
    public static void main(String[] args) {
        int[][][] values = {{{-8, -2}, {-6, -4}}, {{-1, -9}, {-7, -3}}};
        int maximum = values[0][0][0];
        for (int[][] layer : values)
            for (int[] row : layer)
                for (int value : row)
                    if (value > maximum) maximum = value;
        System.out.println("Maximum: " + maximum);
    }
}
