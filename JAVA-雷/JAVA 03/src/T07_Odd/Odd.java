package T07_Odd;

import function.Mathe;
import function.Scan;

/**
 * ��дһ��Java��ʵ�ּ���1��N֮�������?
 * @author ��ҹ֮��
 *
 */

public class Odd {

	public static void main(String[] args) {
		for(int i=2,n=Scan.nextInt("n="); i<=n; i++)
			if(Mathe.IsPrime(i))
				System.out.print("["+i+"],");
	}

}
