package topic;

import function.Scan;

/**
 * ��д������ʾ�Ӽ�������һ���ַ�����
 * Ȼ����ʾ�ַ����ĳ��ȼ���һ�������һ���ַ���
 * @author ��ҹ֮��
 *
 */

public class T13_ShowString {
	public static void main(String[] args) {
		System.out.print("������һ���ַ�����");
		String note=Scan.nextLine();
		System.out.println("Note Length:"+note.length());
		System.out.println("Note First:"+note.charAt(0));
		System.out.println("Note Last:"+note.charAt(note.length()-1));
	}

}
