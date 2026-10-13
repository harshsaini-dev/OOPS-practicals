package lab03.q05;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q05.Lab03Q05

public class Lab03Q05 {
    public static void main(String[] args) {
        int[] values = {-3, -2, 0, 5, 8, 11};
        int even = 0, odd = 0;
        for (int value : values) {
            if (value % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
