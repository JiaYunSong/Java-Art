package socketTest;

import java.net.*;
import java.io.*;

public class JSocketTest {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("/10.2.188.7",8080);
			System.out.println("local:"
					+ s.getLocalAddress()
					+":"+ s.getLocalPort());
			System.out.println("remote:"+s.getInetAddress()
					+":"+s.getPort());
			s.close();
			System.out.println("TCP connection close¡­¡­");
		}catch(UnknownHostException e) {}
		catch (IOException e) {}
		
	}

}
