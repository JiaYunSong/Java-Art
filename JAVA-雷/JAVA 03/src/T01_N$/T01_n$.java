package T01_N$;

import function.Mathe;
import function.Scan;

/**
 * �׳˺���f(n)=n!,����nΪ�������������һ������׳���Factorial���������������Ľ׳ˡ�
 * @author ��ҹ֮��
 *
 */

public class T01_n$ {

	public static void main(String[] args) {
		int n=Scan.nextInt("n=");
		System.out.println("n!="+(int)Mathe.Alg_n$(n));
	}

}
