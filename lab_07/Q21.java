// Thread subclass
public class Q21 {static class Worker extends Thread {public void run(){for(int i=1;i<=5;i++)System.out.println("Worker message "+i);}}public static void main(String[] args)throws InterruptedException{Worker t=new Worker();t.start();t.join();}}
