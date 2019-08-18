package socketTest;

import java.io.*;
import java.net.*;
import java.time.*;

public class JServerSocketTest {
	static public int i=0;
	
	public static void main(String[] args) {
		try {
			//����������һ���˿ں�
			ServerSocket ss=new ServerSocket(8000);
			System.out.println("HelloServer started at 8000����");
			while(i==0) {
				
				//ʹ��accept()������socket����
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
	 * ���߳�
	 * @author ������
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
				
				//ʹ��InputStream��OutputStream����ͨ��
				in=new InputStreamReader(s.getInputStream());
				char[] buf=new char[7];
				in.read(buf,0,buf.length);
				String request=new String(buf);
				System.out.print("�ͻ��˵������ǣ�"+request);
				System.out.print("������ǣ�"+in.getEncoding());
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
	 * ���߳�
	 * @author ������
	 * 
	 */
	public static void timeService(Socket s) {
		InputStreamReader in=null;
		OutputStreamWriter out=null;
		try {
			i++;
			
			//ʹ��InputStream��OutputStream����ͨ��
			in=new InputStreamReader(s.getInputStream());
			char[] buf=new char[7];
			in.read(buf,0,buf.length);
			String request=new String(buf);
			System.out.print("�ͻ��˵������ǣ�"+request);
			System.out.print("������ǣ�"+in.getEncoding());
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
