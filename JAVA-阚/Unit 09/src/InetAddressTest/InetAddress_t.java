package InetAddressTest;

import java.io.IOException;
import java.net.InetAddress;

/**
 * InetAddress
 * @author ¿Ë“π÷Æ√Œ
 *
 */

public class InetAddress_t {
	static public void main(String[] args) {
		try {
			//InetAddress local=InetAddress.getLocalHost();
			
			//byte a[]= {10,3,(byte)191,9};
			//InetAddress local=InetAddress.getByAddress(a);
			InetAddress local=InetAddress.getByName("www.cau.edu.cn");
			System.out.println(local);
			System.out.println(local.getHostName());
			System.out.println(local.getCanonicalHostName());
			System.out.println((local.getAddress()[0]&0x0FF)+"."+
					(local.getAddress()[1]&0x0FF)+"."+
					(local.getAddress()[2]&0x0FF)+"."+
					(local.getAddress()[3]&0x0FF));
			System.out.println(local.isReachable(20));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
