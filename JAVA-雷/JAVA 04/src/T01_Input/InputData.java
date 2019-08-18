package T01_Input;

import java.io.IOException;

public class InputData {
	private static int MAX_SIZE=128;
	private static byte[] buffer;
	/**
	 * 创建最大可输入128个字符的对象
	 */
	public InputData() {}
	/**
	 * 创建最大可输入maxlen个字符的对象
	 */
	public InputData(int maxlen) {
		MAX_SIZE=maxlen;
	}
	/**
	 * 返回从键盘输入的字符串，不包含回车键字符。
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
