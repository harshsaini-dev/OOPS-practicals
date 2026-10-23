// Division by zero with finally
import java.util.Scanner;public class Q01 {public static void main(String[] args){try(Scanner s=new Scanner(System.in)){System.out.print("Two integers: ");int a=s.nextInt(),b=s.nextInt();try{System.out.println("Quotient: "+(a/b));}catch(ArithmeticException e){System.out.println("Cannot divide by zero");}finally{System.out.println("Division attempt complete");}}}}
