package test;

import java.io.*;
import java.net.*;

public class WebSnack {
	private HttpURLConnection web=null;
	public StringBuffer mes=new StringBuffer();;
	
	public WebSnack(URL url){												//以URL创建WebSnack
		try {
			web=(HttpURLConnection)url.openConnection();
		} catch (IOException e) {System.out.print("WebSnack.WebSnack is ERROR!");}
		System.out.println("WebSnack set!\n-----------------------");
	}
	
	public void connect(String RequestMethod,int ConnectTimeout) {			//RequestMethod-连接方式:"GET",ConnectTimeout-等待时间:15000
		try {
			web.setRequestMethod(RequestMethod);
			web.setConnectTimeout(ConnectTimeout);
			web.connect();
			if (web.getResponseCode() != 200) {
				System.out.println(web.getURL()+" is "+web.getResponseCode()+":"+web.getResponseMessage());
				throw new IOException();
			}
		} catch (IOException e) {System.out.print("WebSnack.connect is ERROR!");}
		System.out.println("WebSnack connect set!\n-----------------------");
	}
	public String read(String charsetName) {								//读取网页内容
		try {
			BufferedReader in  = new BufferedReader(new InputStreamReader(web.getInputStream(),charsetName));
			String sLine = null;
			mes=new StringBuffer();
			while ((sLine = in.readLine()) != null)
				mes.append(sLine+"\r\n");
		} catch (IOException e) {System.out.print("WebSnack.read is ERROR!");}
		System.out.println("WebSnack read set!\n-----------------------");
		return mes.toString();
	}
	public void fileio(File k,String mes) {
		try {
			FileWriter fw = new FileWriter(k.toString());
			fw.write("<!-- Copyright.RSMX.bj.2019.07.29 -->\n");
			fw.write(mes);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("WebSnack fileio set!\n-----------------------");
	}
	static public void write(URL url,String charsetName,File k) {
		WebSnack web=new WebSnack(url);
		web.connect("GET", 15000);
		web.fileio(k, web.read(charsetName));
		System.out.println("WebSnack write set!\n-----------------------");
	}
}