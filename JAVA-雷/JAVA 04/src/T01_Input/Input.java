package T01_Input;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * InputData��ʵ�ִӼ�������String�������ݣ��ַ�������
 * ��InputData��Ϊ���࣬
 * ����һ��Input��ʵ�ִӼ�������int��double��boolean�������ݡ� 
 * @author ��ҹ֮��
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
	 * ���شӼ��������Integer��
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
			System.out.println("������󣡷���0");
			return 0;
		}
	}
	/**
	 * ���شӼ��������Double��
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
			System.out.println("������󣡷���0");
			return 0;
		}
	}
	/**
	 * ���شӼ��������Boolean��
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
