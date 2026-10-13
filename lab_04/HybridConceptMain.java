package lab04.q13;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q13.HybridConceptMain

class HybridNotes {
    void explain() {
        // A -> B and A -> C is hierarchical inheritance.
        // B -> D is a multilevel path within that hierarchy.
        // D cannot also extend C: Java has one direct superclass.
        System.out.println("Hybrid means a combination of inheritance forms.");
        System.out.println("Example: A -> B -> D, with A -> C as another branch.");
        System.out.println("Combining hierarchy and a chain is allowed.");
        System.out.println("A child cannot extend both B and C as classes.");
    }
}
public class HybridConceptMain {
    public static void main(String[] args) {
        HybridNotes notes = new HybridNotes();
        notes.explain();
    }
}
