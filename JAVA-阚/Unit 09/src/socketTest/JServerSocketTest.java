package socketTest;

import java.io.*;
import java.net.*;
import java.time.*;

public class JServerSocketTest {
	static public int i=0;
	
	public static void main(String[] args) {
		try {
			//服务器分配一个端口号
			ServerSocket ss=new ServerSocket(8000);
			System.out.println("HelloServer started at 8000……");
			while(i==0) {
				
				//使用accept()方法打开socket连接
				Socket s=ss.accept();
				System.out.println(s.getInetAddress()+":"+s.getPort());
				
				//timeService(s);
				TimeService a=new JServerSocketTest().new TimeService(s);
				Thread t=new Thread(a);
				t.start();
				
				s.close();
			}
			ss.close();
		}catch(IOException e) {}
	}
	
	/**
	 * 多线程
	 * @author 贾云嵩
	 *
	 */
	public class TimeService implements Runnable{
		private Socket s=null;
		TimeService(Socket user){s=user;}
		public void run() {
			i++;
			InputStreamReader in=null;
			OutputStreamWriter out=null;
			try {
				
				//使用InputStream和OutputStream进行通信
				in=new InputStreamReader(s.getInputStream());
				char[] buf=new char[7];
				in.read(buf,0,buf.length);
				String request=new String(buf);
				System.out.print("客户端的请求是："+request);
				System.out.print("其编码是："+in.getEncoding());
				out=new OutputStreamWriter(s.getOutputStream());
				LocalDateTime t=LocalDateTime.now();
				String response=String.format("Hello,%s!%s", request,t);
				out.write(response,0,response.length());
				out.flush();
			}catch(IOException e) {}
			finally {
				try {
					if(in!=null) in.close();
					if(out!=null) out.close();
					if(s!=null) s.close();
				}catch(IOException e) {}
			}
		}
	}
	
	
	
	
	/**
	 * 单线程
	 * @author 贾云嵩
	 * 
	 */
	public static void timeService(Socket s) {
		InputStreamReader in=null;
		OutputStreamWriter out=null;
		try {
			i++;
			
			//使用InputStream和OutputStream进行通信
			in=new InputStreamReader(s.getInputStream());
			char[] buf=new char[7];
			in.read(buf,0,buf.length);
			String request=new String(buf);
			System.out.print("客户端的请求是："+request);
			System.out.print("其编码是："+in.getEncoding());
			out=new OutputStreamWriter(s.getOutputStream());
			LocalDateTime t=LocalDateTime.now();
			String response=String.format("Hello,%s!%s", request,t);
			out.write(response,0,response.length());
			out.flush();
		}catch(IOException e) {}
		finally {
			try {
				if(in!=null) in.close();
				if(out!=null) out.close();
				if(s!=null) s.close();
			}catch(IOException e) {}
		}
	}
	
}
