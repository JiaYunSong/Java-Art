package topic;

import function.Mathe;

/**
 * 编写程序生成2016个随机（int类型）整数，然后按“升序”排序？
 * @author 黎夜之梦
 *
 */

public class T15_2016RandomSort {
	
	public static void main(String[] args) {
		int a[]={Mathe.IntRandom()};
		for(int i=0; i<2015; i++) {
			a=Mathe.IntArrayPlus(a, Mathe.IntRandom());
		}
		Mathe.IntSort(a);
		for(int i=0; i<2016; i++)
			System.out.println(a[i]);
	}

}
