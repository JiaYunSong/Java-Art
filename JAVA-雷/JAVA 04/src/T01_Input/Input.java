package T01_Input;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * InputData类实现从键盘输入String类型数据（字符串）。
 * 以InputData类为父类，
 * 声明一个Input类实现从键盘输入int、double和boolean类型数据。 
 * @author 黎夜之梦
 *
 */

public class Input extends InputData {
	public Input() {
		super();
	}
	public Input(int maxlen) {
		super(maxlen);
	}
	/**
	 * 返回从键盘输入的Integer。
	 */
	public int inputInteger() {
		int a=0;
		String s=inputString();
		Pattern p=Pattern.compile("[ ]+");
		String words[]=p.split(s);
		s=words[0];
		try {
		    a =Integer.valueOf(s);
		    return a;
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("输入错误！返回0");
			return 0;
		}
	}
	/**
	 * 返回从键盘输入的Double。
	 */
	public double inputDouble() {
		double a=0;
		String s=inputString();
		Pattern p=Pattern.compile("[ ]+");
		String words[]=p.split(s);
		s=words[0];
		try {
		    a =Double.valueOf(s);
		    return a;
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("输入错误！返回0");
			return 0;
		}
	}
	/**
	 * 返回从键盘输入的Boolean。
	 * @throws IOException 
	 */
	public boolean inputBoolean() throws IOException {
		String s=inputString();
		Pattern p=Pattern.compile("[ ]+");
		String words[]=p.split(s);
		s=words[0];
		if(s.compareTo("true")==0)
			return true;
		else if(s.compareTo("false")==0)
			return false;
		else throw new IOException();
	}
}
