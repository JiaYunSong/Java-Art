package topic;
import java.util.Scanner;

/**
 * ����ҵ���ֵ��100Ԫ��50Ԫ��20Ԫ��10Ԫ��
 * 5Ԫ��1Ԫ��5�ǣ�1�ǣ�5�֣�1�֡���д����ʵ��
 * �Ӽ�������1��Ԫ���ڵ���������
 * Ȼ��ֽ�ɲ�ͬ�����ģ���ͬ��ֵ������ң�
 * @author ��ҹ֮��
 *
 */
public class T05_Money {
	final static double mon[]= {100,50,20,10,5,1,0.5,0.1,0.05,0.01};
	final static String MON[]= {"100Ԫ","50Ԫ","20Ԫ","10Ԫ","5Ԫ","1Ԫ","5��","1��","5��","1��"};
	static public void MoneyPart(int[] m,double num) {
		for(int i=0; i<10; i++) {
			int k=(int)((num+0.000001)/mon[i]);
			if(k>0) {
				num-=mon[i]*k;
				m[i]+=k;
			}
		}
		System.out.println("�������£�");
		for(int i=0; i<10; i++)
			if(m[i]>0) System.out.println(MON[i]+"��"+m[i]+"��");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������Ǯ����");
		double num=sc.nextDouble();
		int m[]= {0,0,0,0,0,0,0,0,0,0};
		MoneyPart(m,num);
		sc.close();
	}
}
