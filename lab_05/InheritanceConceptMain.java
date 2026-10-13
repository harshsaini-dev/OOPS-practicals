package lab05.q17;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q17.InheritanceConceptMain

class InheritanceNotes {
    void explain() {
        // Multiple class inheritance means one class has two class parents.
        // Invalid Java idea: class C extends A, B { }
        // Java allows one direct superclass, avoiding conflicting parent state
        // and ambiguity over inherited members.
        // Hybrid inheritance combines forms such as hierarchical and multilevel.
        // Interfaces are commonly used for multiple type/behavior inheritance,
        // but this program does not create or implement any interface.
        System.out.println("A Java class cannot extend two classes.");
        System.out.println("Hybrid inheritance combines inheritance forms.");
        System.out.println("Interfaces can supply multiple types; not implemented here.");
    }
}
public class InheritanceConceptMain {
    public static void main(String[] args) {
        InheritanceNotes notes = new InheritanceNotes();
        notes.explain();
    }
}
