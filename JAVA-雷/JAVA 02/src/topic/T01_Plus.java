package topic;

import java.util.Scanner;
import function.Mathe;

/**
 * ��дһ��ʵ��1^2+2^2+....+N^2��Java��
 * @author ��ҹ֮��
 *
 */
public class T01_Plus {
	public static void main(String[] args) {
		System.out.print("����K��");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		sc.close();
		System.out.println("����ǣ�"+Mathe.Sum_n2(k));
	}
}
