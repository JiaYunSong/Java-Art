package topic;

/**
 * �����������м���Բ���ʵĽ���ֵ��
 * ���㲢��ʾ��n=10000,20000,100000ʱԲ���ʵ�ֵ��
 * @author ��ҹ֮��
 *
 */

public class T23_Pi {

	public static void main(String[] args) {
		int num[]= {10000,20000,100000},j=1;
		double Pi;
		for(int n:num) {
			Pi=0;
			for(int i=1; i<=n; i++,j*=-1)
				Pi=Pi+(double)4*j/(2*i-1);
			System.out.println("��("+n+")="+Pi);
		}
	}

}
