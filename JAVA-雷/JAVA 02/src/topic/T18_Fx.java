package topic;

import function.Mathe;
import function.Scan;

/**
 * �������к�����ֵ�����У�xֵ�ڳ����и�����Ӽ������롣
 * @author ��ҹ֮��
 *
 */

public class T18_Fx {
	public static void main(String[] args) {
		System.out.print("x=");
		int x=Scan.nextInt();
		double res=Mathe.Alg_nCubek(Math.E,x-1)*Math.cos(Math.PI/x);
		System.out.println("���Ϊ��"+res);
	}
}
