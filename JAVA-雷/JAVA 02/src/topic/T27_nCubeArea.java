package topic;

import function.Mathe;
import function.Scan;
import function.Sharp;

/**
 * ����������ε������
 * ���У�s�Ǳ߳���nΪ������S����������
 * @author ��ҹ֮��
 *
 */

public class T27_nCubeArea {

	public static void main(String[] args) {
		System.out.print("n=");
		int n=Scan.nextInt();
		System.out.print("s=");
		double s=Scan.nextDouble();
		double area=Sharp.nRegCubeArea(n, s);
		System.out.println("Area="+Mathe.DoubleKill(area, 10));
	}

}
