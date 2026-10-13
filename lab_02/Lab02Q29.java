package lab02.q29;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q29.Lab02Q29

import java.util.Random;

public class Lab02Q29 {
    public static void main(String[] args) {
        Random random = new Random(42);
        int attempts = 0;
        while (true) {
            int number = random.nextInt(100) + 1;
            attempts++;
            if (attempts <= 10 || (number % 7 == 0 && number % 13 == 0))
                System.out.println("Generated: " + number);
            else if (attempts == 11) System.out.println("Continuing the search...");
            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Stopped at " + number + " after " + attempts + " attempts");
                break;
            }
        }
    }
}
