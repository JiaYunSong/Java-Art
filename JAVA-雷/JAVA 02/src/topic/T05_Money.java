package topic;
import java.util.Scanner;

/**
 * 人民币的面值有100元，50元，20元，10元，
 * 5元，1元，5角，1角，5分，1分。编写程序实现
 * 从键盘输入1万元以内的任意数，
 * 然后分解成不同数量的，不同面值的人民币？
 * @author 黎夜之梦
 *
 */
public class T05_Money {
	final static double mon[]= {100,50,20,10,5,1,0.5,0.1,0.05,0.01};
	final static String MON[]= {"100元","50元","20元","10元","5元","1元","5角","1角","5分","1分"};
	static public void MoneyPart(int[] m,double num) {
		for(int i=0; i<10; i++) {
			int k=(int)((num+0.000001)/mon[i]);
			if(k>0) {
				num-=mon[i]*k;
				m[i]+=k;
			}
		}
		System.out.println("方法如下：");
		for(int i=0; i<10; i++)
			if(m[i]>0) System.out.println(MON[i]+"："+m[i]+"张");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入钱数：");
		double num=sc.nextDouble();
		int m[]= {0,0,0,0,0,0,0,0,0,0};
		MoneyPart(m,num);
		sc.close();
	}
}
