package lab04.q01;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q01.StudentRecordMain

class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNo);
    }
}
public class StudentRecordMain {
    public static void main(String[] args) {
        Student student = new Student("Aman", 101);
        student.display();
    }
}
