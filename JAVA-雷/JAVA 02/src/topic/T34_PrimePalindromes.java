package topic;

import function.Mathe;
import function.Scan;

/**
 * ��ָ���ķ�Χ���ҳ�һ����һ�����������
 * ��ν����������ָһ������ͬʱҲ�ǻ�������
 * ���磺131��313��757�ȡ�
 * @author ��ҹ֮��
 *
 */

public class T34_PrimePalindromes {

	public static void main(String[] args) {
		int a=Scan.nextInt("min=");
		int b=Scan.nextInt("max=");
		for(; a<=b; a++)
			if(Mathe.IsPrime(a) && Mathe.IsPalindrome(a))
				System.out.println(a+"\t�ǻ�������");
	}

}
