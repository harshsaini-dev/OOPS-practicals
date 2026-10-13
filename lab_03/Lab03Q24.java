package lab03.q24;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q24.Lab03Q24

public class Lab03Q24 {
    public static void main(String[] args) {
        int[] values = {4, 2, 4, 3, 2, 5};
        int[] unique = new int[values.length];
        int count = 0;
        for (int value : values) {
            boolean exists = false;
            for (int i = 0; i < count; i++)
                if (unique[i] == value) { exists = true; break; }
            if (!exists) unique[count++] = value;
        }
        System.out.println("After removing duplicates:");
        for (int i = 0; i < count; i++) System.out.print(unique[i] + " ");
        System.out.println();
    }
}
