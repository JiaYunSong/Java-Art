package topic;

import function.*;

/**
 * �õ���������a����������
 * @author ��ҹ֮��
 *
 */

public class T26_Iter3 {
	static MatheF f=(double x,double a)->{
		return (2*x+a/(x*x))/3;
	};
	
	public static void main(String[] args) {
		System.out.print("a=");
		double a=Scan.nextDouble();
		double res=Mathe.IterMethods(a, f,5);
		System.out.println("���Ϊ��"+res);
	}

}
