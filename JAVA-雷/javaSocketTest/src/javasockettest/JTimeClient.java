/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasockettest;

import java.io.*;
import java.net.*;

public class JTimeClient {

	public static void main(String[] args) {
		Socket s=null;
		InputStreamReader in=null;
		OutputStreamWriter out=null;
		try {
			s=new Socket("localhost",8080);
			System.out.print("localhost:8080 connected……");
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
			System.out.println("接收的服务响应是："+response);
			System.out.println("其编码是："+in.getEncoding());
		}catch(IOException e) {System.out.println(e.getMessage());}
		finally {
			try {
				if(in!=null) in.close();
				if(out!=null) out.close();
				if(s!=null) s.close();
			}catch(IOException e) {System.out.println("9999");}
		}
	}

}
