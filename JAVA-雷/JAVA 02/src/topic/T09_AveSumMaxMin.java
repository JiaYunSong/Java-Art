package topic;
import java.util.Scanner;

/**
 * �Ӽ������������������ֱ�������ǵ�ƽ��ֵ���ۼӺ͡����ֵ����Сֵ��
 * @author ��ҹ֮��
 *
 */
public class T09_AveSumMaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������������");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Sum��"+(a+b+c));
		System.out.println("Ave��"+(a+b+c)/3);
		System.out.println("Max��"+Math.max(a,Math.max(b, c)));
		System.out.println("Min��"+Math.min(a,Math.min(b, c)));
		sc.close();
	}

}
