package topic;

import function.Mathe;

/**
 * �����������e�Ľ���ֵ��
 * ���㲢��ʾ��n=10000,20000,100000ʱe��ֵ��
 * @author ��ҹ֮��
 *
 */

public class T24_E {

	public static void main(String[] args) {
		int num[]= {10000,20000,100000};
		double E;
		for(int n:num) {
			E=1;
			for(int i=1; i<=n; i++)
				E=E+(double)1/Mathe.Alg_n$(i);
			System.out.println("E("+n+")="+E);
		}
	}

}
