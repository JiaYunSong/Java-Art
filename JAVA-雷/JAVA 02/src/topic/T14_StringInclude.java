package topic;

import function.Scan;

/**
 * 编写程序，提示从键盘输入两个字符串，
 * 然后检测第二个字符串是否包含于第一个串中？
 * 例如，字符串“Lambda expressions let youexpress 
 * instances of single-method classes morecompactly.”
 * 和“express”，其中“express”包含于第一个字符串内。
 * @author 黎夜之梦
 *
 */

public class T14_StringInclude {
	public static void main(String[] args) {
		System.out.print("输入第一个字符串:");
		String str1 = Scan.nextLine();
		System.out.print("输入第二个字符串:");
        String str2 = Scan.nextLine();
        if (str1.contains(str2))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
	
}
