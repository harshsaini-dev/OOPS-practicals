// Abstract Animal Lion and Tiger
public class Q06 {abstract static class Animal {abstract void sound();} static class Lion extends Animal {void sound(){System.out.println("Lion roars");}} static class Tiger extends Animal {void sound(){System.out.println("Tiger growls");}} public static void main(String[] args){new Lion().sound();new Tiger().sound();}}
