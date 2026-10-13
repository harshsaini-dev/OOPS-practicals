package lab02.q28;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q28.Lab02Q28

public class Lab02Q28 {
    public static void main(String[] args) {
        System.out.println("Numbers excluding perfect squares:");
        for (int number = 1; number <= 50; number++) {
            int root = (int) Math.sqrt(number);
            if (root * root == number) continue;
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
