package topic;

import function.Scan;

/**
 * 编写程序，提示从键盘输入一个字符串，
 * 然后显示字符串的长度及第一个和最后一个字符？
 * @author 黎夜之梦
 *
 */

public class T13_ShowString {
	public static void main(String[] args) {
		System.out.print("请输入一个字符串：");
		String note=Scan.nextLine();
		System.out.println("Note Length:"+note.length());
		System.out.println("Note First:"+note.charAt(0));
		System.out.println("Note Last:"+note.charAt(note.length()-1));
	}

}
