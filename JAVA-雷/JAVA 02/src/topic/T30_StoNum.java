package topic;

import function.Scan;

/**
 * ��д������ռ�������������ַ�����
 * ��ת�����������򸡵�����
 * ���磬���롰4353����ת�������� 4353��
 * ���롰0.894����ת����˫���� 0.894��
 * @author ��ҹ֮��
 *
 */

public class T30_StoNum {

	public static void main(String[] args) {
		String num=Scan.next("String=");
		double d=Double.parseDouble(num);
		int i=(int)d;
		if(i==d) System.out.println("Int="+i);
		else System.out.println("Double="+d);
	}

}