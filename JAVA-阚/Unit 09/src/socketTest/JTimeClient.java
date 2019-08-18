package socketTest;

import java.io.*;
import java.net.*;

public class JTimeClient {

	public static void main(String[] args) {
		Socket s=null;
		InputStreamReader in=null;
		OutputStreamWriter out=null;
		try {
			//客户机在host的port端口建立连接
			s=new Socket("localhost",8000);
			System.out.print("localhost:8000 connected……");
			
			//使用InputStream和OutputStream进行通信
			out=new OutputStreamWriter(s.getOutputStream());
			int id=(int)(Math.random()*10);
			String request="Client"+id;
			out.append(request);
			out.flush();
			System.out.println("向服务器发送的是："+request);
			in =new InputStreamReader(s.getInputStream());
			char[] buf=new char[100];
			in.read(buf, 0, buf.length);
			String response=new String(buf);
			System.out.print("接收的服务响应是："+response);
			System.out.println("其编码是："+in.getEncoding());
			
		}catch(IOException e) {}
		finally {
			
			//关闭通信及客户机
			try {
				if(in!=null) in.close();
				if(out!=null) out.close();
				if(s!=null) s.close();
			}catch(IOException e) {}
			
		}
	}

}
