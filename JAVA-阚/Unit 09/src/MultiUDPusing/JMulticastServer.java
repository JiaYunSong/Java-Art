package MultiUDPusing;

import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;

public class JMulticastServer {

	public static void main(String[] args) {try {
		
		System.out.println("Send multicast data to 224.0.1.1:8080бнбн\n");
		InetAddress group=InetAddress.getByName("224.0.1.1");
		DatagramSocket ds=new DatagramSocket();
		for(int n=1; n<=100; n++) {
			LocalDateTime t=LocalDateTime.now();
			String msg=t.getHour()+":"+t.getMinute()+":"+t.getSecond();
			byte buf[]=msg.getBytes();
			DatagramPacket pack=new DatagramPacket(buf,buf.length,group,8080);
			ds.send(pack);
			Thread.sleep(1000);
		}
		ds.close();
		
} catch (IOException | InterruptedException e) {e.printStackTrace();}}}
