package topic;

import function.Points;

/**
 * ��д������ʾ�������㣨x1,y1���ͣ�x2,y2����Ȼ���������֮��ľ��롣
 * ʹ����������ʽ
 * @author ��ҹ֮��
 *
 */

public class T06_Length {
	public static void main(String[] args) {
		System.out.println("�������������ꡪ������");
		double a[]={0,0},b[]={0,0},length;
		a=Points.In("A");
		b=Points.In("B");
		length=Points.Length(a,b);
		System.out.println("�������Ϊ��"+length);
	}
}
