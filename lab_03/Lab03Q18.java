package lab03.q18;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab03.q18.Lab03Q18

import java.util.Scanner;

public class Lab03Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] values = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println("Enter search value:");
        int target = sc.nextInt();
        boolean found = false;
        for (int layer = 0; layer < values.length; layer++)
            for (int row = 0; row < values[layer].length; row++)
                for (int column = 0; column < values[layer][row].length; column++)
                    if (values[layer][row][column] == target) {
                        System.out.printf("Found at zero-based [%d][%d][%d]%n",
                                layer, row, column);
                        found = true;
                    }
        if (!found) System.out.println("Not found");
    }
}
