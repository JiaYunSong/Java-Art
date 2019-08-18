package testfor;

import java.net.*;		 	// ���� java.net ������е��� 
import java.io.*; 			// ���� java.io ������������е��� 
import java.util.*; 		// ����ӳ��ӿ� Map��HashMap 

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
		String htmlPage = null; 										// ���ؽ���ַ���
		try {
			URL url = new URL(httpURL); 								// ���� URL ����
			connection = (HttpURLConnection) url.openConnection(); 		// �� URL ����
											// ������ HTTP �����ͷ����Ϣ��Ȼ���� URL ��������
			connection.setRequestMethod("GET"); 						// �������ӷ�ʽ��GET
			connection.setConnectTimeout(15000); 						// �������� URL �ĳ�ʱʱ�䣺15000 �� ��
			connection.setRequestProperty("User-Agent", "Mozilla/5.0"); // �������������
			connection.connect(); 										// �� URL ��������
																		// ���´������ڴ��������ص� HTTP ��Ӧ
			if (connection.getResponseCode() == 200) { 					// �����Ӧ״̬��
																		// ��ȡ����ʾ HTTP ��Ӧ��ͷ����Ϣ
				System.out.println("------ HTTP response header -------");
				Map<String, List<String>> hf = connection.getHeaderFields();
				for (Map.Entry<String, List<String>> entry : hf.entrySet()) {
					String key = entry.getKey();
					List<String> vList = entry.getValue();
					for (String value : vList)
						System.out.println(key + " : " + value);
				}
				System.out.println("Content-Encoding : " + connection.getContentEncoding());
																		// ��ȡ����ʾ HTTP ��Ӧ���Ĳ��ֵ�����
				System.out.println("------ HTTP response content ------");
				is = connection.getInputStream();					 	// ��ȡ URL ���ӵ�������
				br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				StringBuffer sBuf = new StringBuffer();	 				// ��������ҳ�Ļ�����
				String sLine = null;
				while ((sLine = br.readLine()) != null) {
					sBuf.append(sLine);
					sBuf.append("\r\n");
				}
				htmlPage = sBuf.toString(); 							// �� StringBuffer �����������ַ��� String
			}
			br.close();
			is.close();
			connection.disconnect(); 									// �Ͽ� URL ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		return htmlPage; 												// ���� URL ��ָ������ҳ����
	}
}