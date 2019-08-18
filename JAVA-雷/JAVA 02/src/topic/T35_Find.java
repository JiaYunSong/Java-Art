package topic;

import function.Mathe;

/**
 * 有如下所示数值队列，
 * 分别用“线性法”和“二分法”查找其中某个指定元素。
 * @author 黎夜之梦
 *
 */

public class T35_Find {

	public static void main(String[] args) {
		int a[]= {1,3,2,4,5,6};
		int b[]= {5,6,1,-1,7,9};
		int num=3;
		System.out.println("num->a?(线性法):"+Mathe.Find_Line(a, num));
		System.out.println("num->a?(二分法):"+Mathe.Find_Pair(a, num));
		System.out.println("num->b?(线性法):"+Mathe.Find_Line(b, num));
		System.out.println("num->b?(二分法):"+Mathe.Find_Pair(b, num));
	}

}
