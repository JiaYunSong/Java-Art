package topic;

import function.Mathe;
import function.Scan;

/**
 * ��дһ��Java��ʵ�ֲ���1��n֮�������?
 * @author ��ҹ֮��
 *
 */

public class T20_PrimeNumber {
	
	public static void main(String[] args) {
		System.out.print("n=");
		int n=Scan.nextInt();
		for(int i=0; i<=n; i++)
			if(Mathe.IsPrime(i))
				System.out.println(i);
	}
	
}
