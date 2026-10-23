// Runnable counting 1 to 10
public class Q22 {public static void main(String[] args)throws InterruptedException{Thread t=new Thread(()->{for(int i=1;i<=10;i++)System.out.println(i);});t.start();t.join();}}
