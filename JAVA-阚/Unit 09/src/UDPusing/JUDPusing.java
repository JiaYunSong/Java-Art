package UDPusing;

import java.net.*;
import java.io.*;

public class JUDPusing {

	public static void main(String[] args) throws IOException {
		System.out.println("Receive data at 8080����\n");
		
		byte buf[]=new byte[128];
		DatagramPacket pack=new DatagramPacket(buf,buf.length);
		DatagramSocket ds=new DatagramSocket(8080);
		ds.receive(pack);
		
		InetAddress udpSender=pack.getAddress();
		int port=pack.getPort();
		String msg=new String(pack.getData(),0,pack.getLength());
		
		System.out.println("Receive dta from "+udpSender+":"+port);
		System.out.println("�����յ������ݣ�"+msg);
		ds.close();
	}

}
