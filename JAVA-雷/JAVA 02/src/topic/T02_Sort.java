package topic;

import java.util.Scanner;
import function.*;

/**
 * ĳ��Ŀ��Ҫ�Ի�õ����ݽ�������
 * ��дʵ�ֶ�double���ͺ�int����Ԫ�������
 * Java��DoubleSort��IntegerSort��
 * @author ��ҹ֮��
 *
 */
public class T02_Sort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("DoubleSort() calling!");
		System.out.print("�����������С��");
		int n=sc.nextInt();
		double a[]=new double[n];
		System.out.print("���������֣�");
		for(int i=0; i<n; i++)
			a[i]=sc.nextDouble();
		a=Mathe.DoubleSort(a);
		System.out.print("��������");
		for(double i:a)
			System.out.print(i+" ");
		
		System.out.println("IntegerSort() calling!");
		System.out.print("�����������С��");
		n=sc.nextInt();
		int b[]=new int[n];
		System.out.print("���������֣�");
		for(int i=0; i<n; i++)
			b[i]=sc.nextInt();
		b=Mathe.IntSort(b);
		System.out.print("��������");
		for(int i:b)
			System.out.print(i+" ");
		sc.close();
	}
}
