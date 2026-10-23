// Return and finally ordering
public class Q09 {static int result(){try{System.out.println("Try: preparing return");return 42;}finally{System.out.println("Finally executes before control returns to caller");}}public static void main(String[] args){System.out.println("Returned: "+result());}}
