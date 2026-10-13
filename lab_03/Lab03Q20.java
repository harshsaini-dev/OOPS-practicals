package lab03.q20;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q20.Lab03Q20

public class Lab03Q20 {
    public static void main(String[] args) {
        int[][] marks = {{78, 82}, {70, 75, 80}, {88, 90, 85, 92}};
        for (int student = 0; student < marks.length; student++) {
            System.out.print("Student " + (student + 1) + " marks: ");
            for (int mark : marks[student]) System.out.print(mark + " ");
            System.out.println();
        }
    }
}
