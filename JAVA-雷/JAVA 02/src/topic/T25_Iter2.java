package topic;

import function.*;

/**
 * �õ���������a��ƽ������
 * @author ��ҹ֮��
 *
 */

public class T25_Iter2 {
	static MatheF f=(double x,double a)->{
		return (x+a/x)/2;
	};
	
	public static void main(String[] args) {
		System.out.print("a=");
		double a=Scan.nextDouble();
		double res=Mathe.IterMethods(a, f,5);
		System.out.println("���Ϊ��"+res);
	}

}