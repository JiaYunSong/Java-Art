package T14_IsPrimeNumber;

import function.Mathe;
import function.Scan;

/**
 * ���һ��Java��ʵ�ֶ���������N�ж����Ƿ�Ϊ������
 * ������IsPrimeNumber��
 * @author ��ҹ֮��
 *
 */

public class IsPrimeNumber_test {

	public static void main(String[] args) {
		int n=Scan.nextInt("N=");
		System.out.println(n+" is primenumber is "+Mathe.IsPrime(n));
	}

}
