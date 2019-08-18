package T08_CharRandom;

import function.Mathe;

/**
 * 编写Java类，实现随机生成由20个字符组成的字符串。该字符串包含a-z，A-Z和0-9任意字符。
 * @author 黎夜之梦
 *
 */

public class CharRandom {

	public static void main(String[] args) {
		String str="";
		for(int i=0,j; i<20; i++) {
			j=Mathe.IntRandom(0, 26+26+10);
			if(j<10) str+=Character.toString((char)('0'+j));
			else if(j<36) str+=Character.toString((char)('a'+j-10));
			else str+=Character.toString((char)('A'+j-10-26));
		}
		System.out.println(str);
	}

}
