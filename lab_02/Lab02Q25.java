package lab02.q25;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q25.Lab02Q25

public class Lab02Q25 {
    public static void main(String[] args) {
        int[][] marks = {{70, 80, 90}, {65, 75, 85}, {90, 95, 100}};
        int student = 1;
        long overallTotal = 0;
        int count = 0;
        for (int[] subjects : marks) {
            int total = 0;
            for (int mark : subjects) { total += mark; count++; }
            overallTotal += total;
            System.out.printf("Student %d average: %.2f%n",
                    student++, total / (double) subjects.length);
        }
        System.out.printf("Overall average: %.2f%n", overallTotal / (double) count);
    }
}
