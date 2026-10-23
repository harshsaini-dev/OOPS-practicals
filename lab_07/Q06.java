// throw keyword for age validation
public class Q06 {static void checkAge(int age){if(age<18)throw new IllegalArgumentException("Age must be at least 18");System.out.println("Eligible");}public static void main(String[] args){try{checkAge(16);}catch(IllegalArgumentException e){System.out.println(e.getMessage());}}}
