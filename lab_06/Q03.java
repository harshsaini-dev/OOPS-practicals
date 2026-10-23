// Shape and Rectangle area
public class Q03 {static class Shape {double getArea(){return 0;}} static class Rectangle extends Shape {double length,width; Rectangle(double l,double w){length=l;width=w;} @Override double getArea(){return length*width;}} public static void main(String[] args){System.out.println("Area: "+new Rectangle(5,4).getArea());}}
