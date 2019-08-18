import java.util.Scanner;

/**
 * 从键盘输入三个整数，分别计算它们的累加值与平均数。
 * @author 黎夜之梦
 *
 */
public class T05_InOut {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,add,ave;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		add=a+b+c;
		ave=add/3;
		System.out.println("累加值："+add);
		System.out.println("平均值："+ave);
		sc.close();
	}
}