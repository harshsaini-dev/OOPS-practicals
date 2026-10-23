// Invalid array index
import java.util.Scanner;public class Q02 {public static void main(String[] args){int[] a={10,20,30,40,50};try(Scanner sc=new Scanner(System.in)){System.out.print("Index (0-4): ");try{System.out.println(a[sc.nextInt()]);}catch(ArrayIndexOutOfBoundsException e){System.out.println("Invalid index");}}}}
