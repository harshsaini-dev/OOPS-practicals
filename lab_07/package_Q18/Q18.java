// Lab 07 package exercise 18
import java.util.ArrayList;import java.util.Scanner;public class Q18 {public static void main(String[] args){ArrayList<String> names=new ArrayList<>();try(Scanner sc=new Scanner(System.in)){System.out.print("Name: ");names.add(sc.nextLine());}System.out.println(names);}}
