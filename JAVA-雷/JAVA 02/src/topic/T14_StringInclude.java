package topic;

import function.Scan;

/**
 * ��д������ʾ�Ӽ������������ַ�����
 * Ȼ����ڶ����ַ����Ƿ�����ڵ�һ�����У�
 * ���磬�ַ�����Lambda expressions let youexpress 
 * instances of single-method classes morecompactly.��
 * �͡�express�������С�express�������ڵ�һ���ַ����ڡ�
 * @author ��ҹ֮��
 *
 */

public class T14_StringInclude {
	public static void main(String[] args) {
		System.out.print("�����һ���ַ���:");
		String str1 = Scan.nextLine();
		System.out.print("����ڶ����ַ���:");
        String str2 = Scan.nextLine();
        if (str1.contains(str2))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
	
}
