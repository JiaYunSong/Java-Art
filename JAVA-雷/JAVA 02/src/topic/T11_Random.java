package topic;

import function.Mathe;

/**
 * ��д��������15�������int���ͣ�����?
 * @author ��ҹ֮��
 *
 */
public class T11_Random {
	public static void main(String[] args) {
		System.out.println("15 Random:");
		for(int i=0;i<15;i++)
			System.out.print("["+Mathe.IntRandom()+"] ");
	}

}
