package topic;

import function.Mathe;
import function.Scan;

/**
 * ������M�����С��M������������
 * @author ��ҹ֮��
 *
 */

public class T22_PrimeM {

	public static void main(String[] args) {
		System.out.print("M=");
		int n=Scan.nextInt();
		for(int i=0; i<n; i++)
			if(Mathe.IsPrime(i))
				System.out.println(i);
	}

}
