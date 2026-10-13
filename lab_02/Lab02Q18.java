package lab02.q18;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q18.Lab02Q18

public class Lab02Q18 {
    public static void main(String[] args) {
        long a = 0, b = 1;
        System.out.println("First 20 Fibonacci terms:");
        for (int i = 0; i < 20; i++) {
            System.out.print(a + (i == 19 ? "\n" : " "));
            long next = a + b;
            a = b;
            b = next;
        }
    }
}
