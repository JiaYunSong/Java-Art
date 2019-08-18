package topic;

import function.Mathe;

/**
 * 编写程序生成15个随机（int类型）整数?
 * @author 黎夜之梦
 *
 */
public class T11_Random {
	public static void main(String[] args) {
		System.out.println("15 Random:");
		for(int i=0;i<15;i++)
			System.out.print("["+Mathe.IntRandom()+"] ");
	}

}
