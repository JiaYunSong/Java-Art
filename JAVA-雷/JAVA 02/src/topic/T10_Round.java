package topic;
import java.util.Scanner;

import function.Sharp;

/**
 * ��֪Բ�İ뾶ΪR���Ӽ�������R��ֵ���ֱ����Բ��������ܳ���
 * @author ��ҹ֮��
 *
 */
public class T10_Round {

	public static void main(String[] args) {
		System.out.print("R=");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		sc.close();
		System.out.println("S="+Sharp.RoundArea(r));
		System.out.println("C="+Sharp.RoundLength(r));
	}

}
