package UDPusing;

import java.net.*;
import java.io.*;

public class JUDPSender {

	public static void main(String[] args) {
		try {
			System.out.print("Send data to localhost:8080бнбн");
			InetAddress udpReceiver=InetAddress.getByName("localhost");
			int port=8080;
			String msg="Hello,World!";
			byte buf[]=msg.getBytes();
			
			DatagramPacket pack=new DatagramPacket(buf,buf.length,udpReceiver,port);
			DatagramSocket ds=new DatagramSocket();
			ds.send(pack);
			ds.close();
			System.out.println("Done");
		}catch(IOException e) {}
	}

}
