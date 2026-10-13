package lab02.q19;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q19.Lab02Q19

public class Lab02Q19 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000:");
        for (int number = 1; number <= 1000; number++) {
            int digits = 0;
            for (int value = number; value > 0; value /= 10) digits++;
            int sum = 0;
            for (int value = number; value > 0; value /= 10) {
                int digit = value % 10, power = 1;
                for (int k = 0; k < digits; k++) power *= digit;
                sum += power;
            }
            if (sum == number) System.out.print(number + " ");
        }
        System.out.println();
    }
}
