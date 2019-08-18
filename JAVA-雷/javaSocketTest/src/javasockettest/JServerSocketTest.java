/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasockettest;

import java.io.*;
import java.net.*;
import java.time.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JServerSocketTest {
	static public int i=0;
	
	public static void main(String[] args) {
            /**
	 * 多线程
	 * @author 黎夜之梦
	 *
	 */
	class TimeService implements Runnable{
		private Socket s=null;
		TimeService(Socket user){s=user;}
                @Override
		public void run() {
			i++;
			InputStreamReader in=null;
			OutputStreamWriter out=null;
			try {
				in=new InputStreamReader(s.getInputStream());
				char[] buf=new char[7];
				in.read(buf,0,buf.length);
				String request=new String(buf);
				System.out.print("客户端的请求是："+request);
				System.out.println("其编码是："+in.getEncoding());
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
				}catch(IOException e) {System.out.println("????");}
			}
		}
	}
		try {
			ServerSocket ss=new ServerSocket(8080);
			System.out.println("HelloServer started at 8080……");
			while(true) {
				Socket s=ss.accept();
                                System.out.println("------------");
				System.out.println(s.getInetAddress()+":"+s.getPort());
				
				//timeService(s);
				TimeService a=new TimeService(s);
				Thread t=new Thread(a);
				t.start();
                                Thread.sleep(5000);
				s.close();
			}
		}catch(IOException e) {System.out.println("??");} catch (InterruptedException ex) {
                Logger.getLogger(JServerSocketTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
	
	
	
	
	
	
	/**
	 * 单线程
	 * @param s
	 */
	public static void timeService(Socket s) {
		InputStreamReader in=null;
		OutputStreamWriter out=null;
		try {
			i++;
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
