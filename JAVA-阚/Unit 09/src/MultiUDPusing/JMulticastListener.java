package MultiUDPusing;

import java.net.*;

public class JMulticastListener {

	public static void main(String[] args) {
		try {
			System.out.println("Listen multicast data at 224.0.1.1:8080……\n");
			byte buf[]=new byte[128];
			DatagramPacket pack=new DatagramPacket(buf,buf.length);
			MulticastSocket ms=new MulticastSocket(8080);
			InetAddress group=InetAddress.getByName("224.0.1.1");
			ms.joinGroup(group);
			for(int n=1; n<5 ;n++) {
				ms.receive(pack);
				String msg=new String(pack.getData(),0,pack.getLength());
				System.out.println(n+"-收到的数据："+msg);
				Thread.sleep(1000);
			}
			ms.leaveGroup(group);
			ms.close();
			System.out.println("quit the multicast group at 224.0.1.1:8080");
		}catch(Exception e) {}
	}

}
