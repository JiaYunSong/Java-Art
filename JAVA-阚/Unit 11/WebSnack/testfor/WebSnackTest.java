package testfor;

import java.io.*;
import java.net.*;
import test.WebSnack;

public class WebSnackTest {

	public static void main(String[] args) {
		URL url=null;
		String charsetName="UTF-8";
		File k=new File(".\\internetWorm\\jsouptest\\1.html");
		
		try {url=new URL("http://www.cau.edu.cn/index.html");
		} catch (MalformedURLException e) {e.printStackTrace();}
		
//		WebSnack web=new WebSnack(url);
//		web.connect("GET", 15000);
//		String webmes=web.read(charsetName);
//		web.fileio(k, webmes);
		
		WebSnack.write(url, charsetName, k);
	}

}