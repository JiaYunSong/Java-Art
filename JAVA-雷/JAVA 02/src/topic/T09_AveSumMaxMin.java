package topic;
import java.util.Scanner;

/**
 * 从键盘输入三个整数，分别计算它们的平均值、累加和、最大值和最小值。
 * @author 黎夜之梦
 *
 */
public class T09_AveSumMaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Sum："+(a+b+c));
		System.out.println("Ave："+(a+b+c)/3);
		System.out.println("Max："+Math.max(a,Math.max(b, c)));
		System.out.println("Min："+Math.min(a,Math.min(b, c)));
		sc.close();
	}

}
