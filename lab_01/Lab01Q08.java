package lab01.q08;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab01.q08.Lab01Q08

import java.util.Scanner;

public class Lab01Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        if (ch < 'a' || ch > 'z') System.out.println("Not an English letter");
        else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else System.out.println("Consonant");
    }
}
