package lab03.q22;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q22.Lab03Q22

public class Lab03Q22 {
    public static void main(String[] args) {
        int[] values = {2, 3, 2, 5, 3, 2};
        boolean[] counted = new boolean[values.length];
        for (int i = 0; i < values.length; i++) {
            if (counted[i]) continue;
            int frequency = 0;
            for (int j = i; j < values.length; j++) {
                if (values[j] == values[i]) { frequency++; counted[j] = true; }
            }
            System.out.println(values[i] + " occurs " + frequency + " time(s)");
        }
    }
}
