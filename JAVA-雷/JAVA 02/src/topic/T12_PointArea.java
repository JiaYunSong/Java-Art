package topic;

import function.Points;
import function.Sharp;

/**
 * ��һ�����ε���������A(x,y)��B(x,y)��C(x,y)��
 * ��д����Ӽ�������������������꣬
 * Ȼ�������������ε������߳��������
 * @author ��ҹ֮��
 *
 */

public class T12_PointArea {
	public static void main(String[] args) {
		double A[],B[],C[];
		System.out.println("������A,B,C�������꣺");
		A=Points.In("A");
		B=Points.In("B");
		C=Points.In("C");
		Sharp.TriangleArea(A,B,C);
	}

}
