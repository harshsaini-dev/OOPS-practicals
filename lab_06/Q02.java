// Vehicle and Car override
public class Q02 {static class Vehicle {void drive(){System.out.println("Vehicle driving");}} static class Car extends Vehicle {@Override void drive(){System.out.println("Repairing a car");}} public static void main(String[] args){new Car().drive();}}
