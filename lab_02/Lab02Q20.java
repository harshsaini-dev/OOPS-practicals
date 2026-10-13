package lab02.q20;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q20.Lab02Q20

import java.util.Scanner;

public class Lab02Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        int attempts = 0;
        // This fixed value is only for a loop demonstration.
        String correct = "java123";
        do {
            System.out.println("Enter password:");
            password = sc.nextLine();
            attempts++;
            if (!password.equals(correct)) System.out.println("Incorrect password");
        } while (!password.equals(correct));
        System.out.println("Access granted after " + attempts + " attempt(s)");
    }
}
