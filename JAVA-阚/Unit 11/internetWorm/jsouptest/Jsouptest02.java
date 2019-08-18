package jsouptest;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Jsouptest02 {

	public static void main(String[] args) {
			Document web=Jsoup.parse("E:\\1.课内资料\\1-大一下课程\\自-Java\\Unit 11\\internetWorm\\jsouptest\\1.html","UTF-8");
			
			System.out.println("---------------");
			System.out.println(web.title());
			System.out.println(web.nodeName());
			System.out.println(web.charset().name());
			
			Element head=web.head();
			Element body=web.body();
			System.out.println("---------------");
			System.out.println(head.toString());
			System.out.println("---------------");
			System.out.println(body.toString());
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
			
	}

}
