package testfor;

import java.net.*;		 	// 导入 java.net 网络包中的类 
import java.io.*; 			// 导入 java.io 输入输出流包中的类 
import java.util.*; 		// 导入映射接口 Map、HashMap 

public class HTTPURLConnectionTest {
	public static void main(String[] args) {
		String htmlPage;
		htmlPage = doGet("http://www.cau.edu.cn/index.html");
											 //htmlPage = doGet("https://www.baidu.com/s?wd=java");
		//if (htmlPage.length() <= 1000)
			System.out.println(htmlPage);
		//else
		//	System.out.println(htmlPage.substring(0, 1000));
	}

	public static String doGet(String httpURL) {
		HttpURLConnection connection = null;
		InputStream is = null;
		BufferedReader br = null;
		String htmlPage = null; 										// 返回结果字符串
		try {
			URL url = new URL(httpURL); 								// 创建 URL 对象
			connection = (HttpURLConnection) url.openConnection(); 		// 打开 URL 连接
											// 先设置 HTTP 请求的头部信息，然后与 URL 建立连接
			connection.setRequestMethod("GET"); 						// 设置连接方式：GET
			connection.setConnectTimeout(15000); 						// 设置连接 URL 的超时时间：15000 毫 秒
			connection.setRequestProperty("User-Agent", "Mozilla/5.0"); // 设置浏览器名称
			connection.connect(); 										// 与 URL 建立连接
																		// 以下代码用于处理所返回的 HTTP 响应
			if (connection.getResponseCode() == 200) { 					// 检查响应状态码
																		// 读取并显示 HTTP 响应的头部信息
				System.out.println("------ HTTP response header -------");
				Map<String, List<String>> hf = connection.getHeaderFields();
				for (Map.Entry<String, List<String>> entry : hf.entrySet()) {
					String key = entry.getKey();
					List<String> vList = entry.getValue();
					for (String value : vList)
						System.out.println(key + " : " + value);
				}
				System.out.println("Content-Encoding : " + connection.getContentEncoding());
																		// 读取并显示 HTTP 响应正文部分的内容
				System.out.println("------ HTTP response content ------");
				is = connection.getInputStream();					 	// 获取 URL 连接的输入流
				br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				StringBuffer sBuf = new StringBuffer();	 				// 定义存放网页的缓冲区
				String sLine = null;
				while ((sLine = br.readLine()) != null) {
					sBuf.append(sLine);
					sBuf.append("\r\n");
				}
				htmlPage = sBuf.toString(); 							// 将 StringBuffer 缓冲区传出字符串 String
			}
			br.close();
			is.close();
			connection.disconnect(); 									// 断开 URL 连接
		} catch (IOException e) {
			e.printStackTrace();
		}
		return htmlPage; 												// 返回 URL 所指定的网页内容
	}
}