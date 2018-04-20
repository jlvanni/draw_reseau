package draw_reseau;


import java.net.*; 
import java.io.*;


public class Tsock_serv {
	public static void main(String[] args) {
	
		String toto;
		toto="";
		
		ServerSocket serverSocket = null;

    serverSocket = new ServerSocket(4444);

while(true) {
    Socket socket = null;
    socket = serverSocket.accept();
    System.out.println("serveur demar");

    //DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    //DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    
    //byte[] bytes = new byte[1024];

    //in.read(bytes);
    toto=socket.getInputStream();
    System.out.println(toto);

    //FileOutputStream fos = new FileOutputStream("C:\\test2.xml");
    //fos.write(bytes);

	}
	}
}
