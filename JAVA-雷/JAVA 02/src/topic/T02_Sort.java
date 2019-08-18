package topic;

import java.util.Scanner;
import function.*;

/**
 * 某项目需要对获得的数据进行排序，
 * 编写实现对double类型和int数组元素排序的
 * Java类DoubleSort和IntegerSort。
 * @author 黎夜之梦
 *
 */
public class T02_Sort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("DoubleSort() calling!");
		System.out.print("请输入数组大小：");
		int n=sc.nextInt();
		double a[]=new double[n];
		System.out.print("请输入数字：");
		for(int i=0; i<n; i++)
			a[i]=sc.nextDouble();
		a=Mathe.DoubleSort(a);
		System.out.print("排序结果：");
		for(double i:a)
			System.out.print(i+" ");
		
		System.out.println("IntegerSort() calling!");
		System.out.print("请输入数组大小：");
		n=sc.nextInt();
		int b[]=new int[n];
		System.out.print("请输入数字：");
		for(int i=0; i<n; i++)
			b[i]=sc.nextInt();
		b=Mathe.IntSort(b);
		System.out.print("排序结果：");
		for(int i:b)
			System.out.print(i+" ");
		sc.close();
	}
}
