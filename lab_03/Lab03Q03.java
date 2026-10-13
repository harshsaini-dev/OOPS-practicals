package lab03.q03;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q03.Lab03Q03

public class Lab03Q03 {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        long sum = 0;
        for (int value : values) sum += value;
        System.out.println("Sum: " + sum);
    }
}
