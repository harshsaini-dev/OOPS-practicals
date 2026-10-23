// Finally resource cleanup
public class Q05 {public static void main(String[] args){try{System.out.println("File opened");throw new IllegalStateException("Simulated error");}catch(IllegalStateException e){System.out.println(e.getMessage());}finally{System.out.println("Resource closed");}}}
