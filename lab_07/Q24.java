// Two concurrent named threads
public class Q24 {public static void main(String[] args)throws InterruptedException{Runnable job=()->{for(int i=0;i<4;i++)System.out.println(Thread.currentThread().getName()+" "+i);};Thread a=new Thread(job,"Alpha"),b=new Thread(job,"Beta");a.start();b.start();a.join();b.join();}}
