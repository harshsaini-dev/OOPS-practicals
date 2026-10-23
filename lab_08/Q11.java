// InetAddress host and IP
import java.net.*;public class Q11 {public static void main(String[] args)throws Exception{InetAddress a=InetAddress.getLocalHost();System.out.println("Host name: "+a.getHostName());System.out.println("IP address: "+a.getHostAddress());}}
