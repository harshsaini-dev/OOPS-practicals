// TCP HelloServer on port 5000
import java.net.*;public class Q12 {public static void main(String[] args)throws Exception{try(ServerSocket server=new ServerSocket(5000)){System.out.println("Waiting on 5000...");try(Socket socket=server.accept()){System.out.println("Client connected");}}}}
