package T01_Input;

import java.io.IOException;

public class InputData {
	private static int MAX_SIZE=128;
	private static byte[] buffer;
	/**
	 * ������������128���ַ��Ķ���
	 */
	public InputData() {}
	/**
	 * ������������maxlen���ַ��Ķ���
	 */
	public InputData(int maxlen) {
		MAX_SIZE=maxlen;
	}
	/**
	 * ���شӼ���������ַ������������س����ַ���
	 */
	public String inputString() {
		String data;
		int nums;
		buffer=new byte[MAX_SIZE];
		try {
			nums=System.in.read(buffer);
			data=new String(buffer,0,nums-1);
			data=data.trim();
		}catch(IOException ioe) {
			data=null;
		}
		return data;
	}
}
