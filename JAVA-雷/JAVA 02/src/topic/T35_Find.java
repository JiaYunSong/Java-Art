package topic;

import function.Mathe;

/**
 * ��������ʾ��ֵ���У�
 * �ֱ��á����Է����͡����ַ�����������ĳ��ָ��Ԫ�ء�
 * @author ��ҹ֮��
 *
 */

public class T35_Find {

	public static void main(String[] args) {
		int a[]= {1,3,2,4,5,6};
		int b[]= {5,6,1,-1,7,9};
		int num=3;
		System.out.println("num->a?(���Է�):"+Mathe.Find_Line(a, num));
		System.out.println("num->a?(���ַ�):"+Mathe.Find_Pair(a, num));
		System.out.println("num->b?(���Է�):"+Mathe.Find_Line(b, num));
		System.out.println("num->b?(���ַ�):"+Mathe.Find_Pair(b, num));
	}

}
