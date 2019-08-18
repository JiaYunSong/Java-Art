package topic;

import java.util.Scanner;
import function.Mathe;

/**
 * 编写一个实现1^2+2^2+....+N^2的Java类
 * @author 黎夜之梦
 *
 */
public class T01_Plus {
	public static void main(String[] args) {
		System.out.print("输入K：");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		sc.close();
		System.out.println("结果是："+Mathe.Sum_n2(k));
	}
}
