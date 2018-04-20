package draw_reseau;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tsock_client {
	
	public static void main(String[] args) {
		
		String toto;
		String host="127.0.0.1";
		toto="";
		
		ServerSocket serverSocket = null;

    serverSocket = new ServerSocket(host,4444);

    Socket socket = null;
    socket = serverSocket.accept();
    //System.out.println("serveur demar");

    //DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    //DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    
    //byte[] bytes = new byte[1024];

    //in.read(bytes);
    toto="tata";
    socket.getOutputStream(toto);
    System.out.println("Envois");
    System.out.println(toto);

    //FileOutputStream fos = new FileOutputStream("C:\\test2.xml");
    //fos.write(bytes);

	
	}


}
