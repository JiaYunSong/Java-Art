package topic;
import java.util.Scanner;

import function.Sharp;

/**
 * ��Java����һ�������Σ�
 * �ṩ�������������������
 * �����ε������߳��Ӽ������롣
 * @author ��ҹ֮��
 *
 */
public class T03_TriangleArea {
	public static void main(String[] args) {
		System.out.println("���������߳���");
		double t[]=new double[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++)
			t[i]=sc.nextDouble();
		sc.close();
		System.out.println("���������Ϊ��"+Sharp.TriangleArea(t));
	}
}
