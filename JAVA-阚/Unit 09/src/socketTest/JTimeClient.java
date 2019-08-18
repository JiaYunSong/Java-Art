package socketTest;

import java.io.*;
import java.net.*;

public class JTimeClient {

	public static void main(String[] args) {
		Socket s=null;
		InputStreamReader in=null;
		OutputStreamWriter out=null;
		try {
			//�ͻ�����host��port�˿ڽ�������
			s=new Socket("localhost",8000);
			System.out.print("localhost:8000 connected����");
			
			//ʹ��InputStream��OutputStream����ͨ��
			out=new OutputStreamWriter(s.getOutputStream());
			int id=(int)(Math.random()*10);
			String request="Client"+id;
			out.append(request);
			out.flush();
			System.out.println("����������͵��ǣ�"+request);
			in =new InputStreamReader(s.getInputStream());
			char[] buf=new char[100];
			in.read(buf, 0, buf.length);
			String response=new String(buf);
			System.out.print("���յķ�����Ӧ�ǣ�"+response);
			System.out.println("������ǣ�"+in.getEncoding());
			
		}catch(IOException e) {}
		finally {
			
			//�ر�ͨ�ż��ͻ���
			try {
				if(in!=null) in.close();
				if(out!=null) out.close();
				if(s!=null) s.close();
			}catch(IOException e) {}
			
		}
	}

}
