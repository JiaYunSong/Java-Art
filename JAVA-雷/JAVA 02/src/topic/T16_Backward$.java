package topic;

import function.Mathe;
/**
 * 1/1!+1/2!+1/3!+1/4!
 * @author ��ҹ֮��
 *
 */

public class T16_Backward$ {

	public static void main(String[] args) {
		double sum=0;
		for(int i=1; i<5; i++)
			sum=sum+1/Mathe.Alg_n$(i);
		System.out.println("����ǣ�"+sum);
	}

}
