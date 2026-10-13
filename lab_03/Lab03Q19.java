package lab03.q19;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q19.Lab03Q19

public class Lab03Q19 {
    public static void main(String[] args) {
        int[][] jagged = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        System.out.println("Jagged array:");
        for (int row = 0; row < jagged.length; row++) {
            System.out.print("Row " + row + ": ");
            for (int value : jagged[row]) System.out.print(value + " ");
            System.out.println();
        }
    }
}
