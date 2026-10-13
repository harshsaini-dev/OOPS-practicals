package lab04.q12;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q12.MultipleConceptMain

class InheritanceNotes {
    void explain() {
        // Invalid class inheritance: class C extends A, B { }
        // Conflicting parent members can make inheritance ambiguous.
        // Java gives each class at most one direct superclass.
        System.out.println("Multiple class inheritance: one child, two parents.");
        System.out.println("Java cannot extend two classes.");
        System.out.println("Interfaces can support multiple types, but are not used here.");
    }
}
public class MultipleConceptMain {
    public static void main(String[] args) {
        InheritanceNotes notes = new InheritanceNotes();
        notes.explain();
    }
}
