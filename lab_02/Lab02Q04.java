package lab02.q04;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab02.q04.Lab02Q04

public class Lab02Q04 {
    public static void main(String[] args) {
        int visitors = 2;
        System.out.println("Initially: " + visitors);
        System.out.println("Prefix entry (++visitors): " + (++visitors));
        System.out.println("Postfix entry (visitors++): " + (visitors++));
        System.out.println("After postfix entry: " + visitors);
        System.out.println("Prefix exit (--visitors): " + (--visitors));
        System.out.println("Postfix exit (visitors--): " + (visitors--));
        System.out.println("Final visitors: " + visitors);
    }
}
