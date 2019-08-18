package testfor;

import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		try {
			
			URL url=new URL("http://www.cau.edu.cn/index.html");
			//URL url=new URL("http","www.cau.edu.cn","/index.html");
			//URL url=new URL("http","www.cau.edu.cn/",80,"/index.html");
			System.out.println("----------getHost()---------");
			System.out.println(url.getHost());
			System.out.println("----------getPort()---------");
			System.out.println(url.getPort());
			System.out.println("----------getDefaultPort()---------");
			System.out.println(url.getDefaultPort());
			System.out.println("----------getQuery()---------");
			System.out.println(url.getQuery());
			System.out.println("----------getPath()---------");
			System.out.println(url.getPath());
			
			URLConnection con = null;
			con=(HttpURLConnection) url.openConnection(); 	
			con.setRequestProperty("RSMX", "BlackHoll");
			con.setDoInput(true);
			con.setDoOutput(false);
			con.setConnectTimeout(15000);
			con.setReadTimeout(15000);
			con.connect();
			
			System.out.println("----------getHeaderFields()----------");
			Map<String, List<String>> hf = con.getHeaderFields();
			for (Map.Entry<String, List<String>> entry : hf.entrySet()) {
				String key = entry.getKey();
				List<String> vList = entry.getValue();
				for (String value : vList)
					System.out.println(key + " : " + value);
			}
			
			System.out.println("----------getContentEncoding()---------");
			System.out.println(con.getContentEncoding());
			
			System.out.println("----------getContentType()---------");
			System.out.println(con.getContentType());
			
			System.out.println("----------getURL()---------");
			System.out.println(con.getURL());
			
			HttpURLConnection c=(HttpURLConnection)con;
			c.connect();
			System.out.println("----------getResponseCode()---------");
			System.out.println(c.getResponseCode());
			
			System.out.println("----------getResponseMessage()---------");
			System.out.println(c.getResponseMessage());
			
			System.out.println("----------getRequestMethod()---------");
			System.out.println(c.getRequestMethod());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
