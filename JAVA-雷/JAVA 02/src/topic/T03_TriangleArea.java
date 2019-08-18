package topic;
import java.util.Scanner;

import function.Sharp;

/**
 * 用Java描述一个三角形，
 * 提供计算三角形面积方法。
 * 三角形的三个边长从键盘输入。
 * @author 黎夜之梦
 *
 */
public class T03_TriangleArea {
	public static void main(String[] args) {
		System.out.println("请输入三边长：");
		double t[]=new double[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++)
			t[i]=sc.nextDouble();
		sc.close();
		System.out.println("三角形面积为："+Sharp.TriangleArea(t));
	}
}
