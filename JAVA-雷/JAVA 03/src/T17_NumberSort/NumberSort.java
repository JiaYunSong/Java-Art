package T17_NumberSort;

import java.util.Arrays;

/**
 * 设计数值排序器，
 * 实现对Java数值型数据排序，
 * 类名称NumberSort。
 * @author 黎夜之梦
 *
 */

public class NumberSort<T> {
	
	public T[] f(T[] a) {
		Arrays.sort(a);
		return a;
	}
	public void out(T[] a) {
		for(int i=0; i<a.length; i++)
			System.out.print("["+a[i]+"]\t");
		System.out.print("\n");
	}

	public static void main(String[] args) {
		Integer a[]= {1,2,5,4,3};
		System.out.print("sort(Integer)\t=\t");
		new NumberSort<Integer>().out
			(new NumberSort<Integer>().f(a));

		Float f[]= {(float)1.0,(float)5.6,(float)4.4,(float)6.8};
		System.out.print("sort(Float)\t=\t");
		new NumberSort<Float>().out
			(new NumberSort<Float>().f(f));

		Double b[]= {1.1,9.0,5.4,6.0};
		System.out.print("sort(Double)\t=\t");
		new NumberSort<Double>().out
			(new NumberSort<Double>().f(b));

		Character p[]= {'d','f','+','#'};
		System.out.print("sort(Character)\t=\t");
		new NumberSort<Character>().out
			(new NumberSort<Character>().f(p));
	}

}
