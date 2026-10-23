// Thread join
public class Q27 {public static void main(String[] args)throws InterruptedException{Thread a=new Thread(()->System.out.println("First thread done"));a.start();a.join();Thread b=new Thread(()->System.out.println("Second starts after first"));b.start();b.join();}}
