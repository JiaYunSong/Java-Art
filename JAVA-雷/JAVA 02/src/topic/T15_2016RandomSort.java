package topic;

import function.Mathe;

/**
 * ��д��������2016�������int���ͣ�������Ȼ�󰴡���������
 * @author ��ҹ֮��
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
