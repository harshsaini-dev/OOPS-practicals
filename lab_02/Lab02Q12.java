package lab02.q12;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q12.Lab02Q12

import java.util.Scanner;

public class Lab02Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int smallest = (a <= b)
            ? ((a <= c) ? ((a <= d) ? a : d) : ((c <= d) ? c : d))
            : ((b <= c) ? ((b <= d) ? b : d) : ((c <= d) ? c : d));
        System.out.println("Smallest: " + smallest);
    }
}
