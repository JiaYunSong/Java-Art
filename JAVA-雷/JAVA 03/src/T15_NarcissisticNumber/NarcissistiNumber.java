package T15_NarcissisticNumber;

import function.Mathe;
import function.Scan;

/**
 * ˮ�ɻ�����ָ���λ��ʮλ����λ�������������͵������������
 * ���ˮ�ɻ����࣬�ṩ
 * (1)��������3λ�����Ƿ���ˮ�ɻ�����
 * (2)����ָ����Χ�ڵ�����ˮ�ɻ�����
 * @author ��ҹ֮��
 *
 */

public class NarcissistiNumber {

	public static void main(String[] args) {
		int n=Scan.nextInt("n=");
		System.out.println(n+" is narcissisti number is "+Mathe.IsNarcissistiNumber(n));
		n=Scan.nextInt("n=");
		System.out.println(n+" is narcissisti number is "+Mathe.IsNarcissistiNumber(n));
		n=Scan.nextInt("n=");
		System.out.println(n+" is narcissisti number is "+Mathe.IsNarcissistiNumber(n));
		int a=Scan.nextInt("min="),b=Scan.nextInt("max=");
		for(n=a; n<=b; n++) {
			if(Mathe.IsNarcissistiNumber(n))
				System.out.print("["+n+"]");
		}
	}

}
