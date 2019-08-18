package jsouptest;

import java.io.*;
import java.net.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

public class Jsouptest01 {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://www.cau.edu.cn/index.html");
			//url=new URL("http://www.baidu.com");
			
			Document web=Jsoup.parse(url, 15000);
//			web=Jsoup.parse("<head></head><body></body>");
//			web=Jsoup.parse("d://1.html");
//			web=Jsoup.parseBodyFragment("<body></body>");
			System.out.println("---------------");
			System.out.println(web.title());
			System.out.println(web.nodeName());
			System.out.println(web.charset().name());
			
			Element head=web.head();
			Element body=web.body();
			System.out.println("---------------");
			System.out.println(head.toString().substring(0, 500));
			System.out.println("---------------");
			System.out.println(body.toString().substring(0, 500));
			System.out.println("\n\n---------------");
			System.out.println(body.tagName());
			System.out.println(body.hasAttr("id"));
			if(body.hasAttr("id"))
				System.out.println(body.attr("id"));
			System.out.println("***:"+body.hasClass("class"));
			
			System.out.println("\n\n---------------");
			System.out.println("***:"+body.data());
			System.out.println("\n\n---------------");
			System.out.println("***:"+body.hasText());
			if(body.hasText())
				System.out.println("***:"+body.text());
			System.out.println("\n\n---------------");
			System.out.println("***:"+body.ownText());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
