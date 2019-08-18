package T13_Fibonancii;

import function.Mathe;
import function.Scan;

/**
 * Fibonancii������ʽ��1,1,2,3,5,8,13,21,34,......��
 * ����X1=X2=1��Xi=X(i-1)+X(i-2)��
 * ���Fibonancii�࣬ʵ�ּ��㼶����N��ͷ���ǰN�
 * @author ��ҹ֮��
 *
 */

public class Fibonancii_test {

	public static void main(String[] args) {
		int n=Scan.nextInt("n=");
		System.out.println("Fibonancii["+n+"]="+Mathe.Fibonancii(n));
		for(int i=1; i<=n; i++) {
			System.out.print("["+Mathe.Fibonancii(i)+"]");
		}
	}

}
