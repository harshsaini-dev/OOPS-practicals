package lab02.q13;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q13.Lab02Q13

import java.util.Scanner;

public class Lab02Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        boolean letter = ch >= 'a' && ch <= 'z';
        boolean vowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        String type = letter ? (vowel ? "Vowel" : "Consonant")
                : (ch >= '0' && ch <= '9' ? "Digit" : "Special symbol");
        System.out.println(type);
    }
}
