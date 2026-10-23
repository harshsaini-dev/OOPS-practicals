// Unsafe shared counter
public class Q28 {static int counter=0;public static void main(String[] args)throws InterruptedException{Runnable job=()->{for(int i=0;i<100000;i++)counter++;};Thread[] ts=new Thread[8];for(int i=0;i<ts.length;i++){ts[i]=new Thread(job);ts[i].start();}for(Thread t:ts)t.join();System.out.println("Expected 800000; actual "+counter+" (race may be nondeterministic)");}}
