package lab05.q01;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q01.StudentMain

class Student {
    String name;
    int rollNo;
    double marks;
    Student() {
        name = "Aman";
        rollNo = 101;
        marks = 82.5;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
