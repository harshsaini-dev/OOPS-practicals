// TCP HelloClient
import java.net.*;import java.io.*;public class Q13 {public static void main(String[] args)throws Exception{try(Socket s=new Socket("localhost",5000);PrintWriter out=new PrintWriter(s.getOutputStream(),true)){out.println("Hello Server");System.out.println("Sent: Hello Server");}}}
