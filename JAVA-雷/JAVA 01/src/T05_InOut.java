import java.util.Scanner;

/**
 * �Ӽ������������������ֱ�������ǵ��ۼ�ֵ��ƽ������
 * @author ��ҹ֮��
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
		System.out.println("�ۼ�ֵ��"+add);
		System.out.println("ƽ��ֵ��"+ave);
		sc.close();
	}
}