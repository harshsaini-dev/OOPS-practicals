// Nested try blocks
public class Q04 {public static void main(String[] args){int[] data={3,6,9};int index=8,divisor=0;try{try{System.out.println(data[index]);}catch(ArrayIndexOutOfBoundsException e){System.out.println("Inner catch: invalid index");}System.out.println(12/divisor);}catch(ArithmeticException e){System.out.println("Outer catch: division by zero");}}}
