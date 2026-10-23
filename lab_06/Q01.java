// Method overriding: Animal and Cat
public class Q01 {static class Animal {void makeSound(){System.out.println("Animal sound");}} static class Cat extends Animal {@Override void makeSound(){System.out.println("Bark");}} public static void main(String[] args){new Cat().makeSound();}}
