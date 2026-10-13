package lab04.q14;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q14.ShapeHierarchyMain

class Shape {
    protected String name;
    Shape(String name) { this.name = name; }
}
class Rectangle extends Shape {
    private double length, width;
    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    double calculateArea() { return length * width; }
    void display() { System.out.printf("%s area: %.2f%n", name, calculateArea()); }
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) { super("Circle"); this.radius = radius; }
    double calculateArea() { return Math.PI * radius * radius; }
    void display() { System.out.printf("%s area: %.2f%n", name, calculateArea()); }
}
public class ShapeHierarchyMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(2);
        rectangle.display();
        circle.display();
    }
}
