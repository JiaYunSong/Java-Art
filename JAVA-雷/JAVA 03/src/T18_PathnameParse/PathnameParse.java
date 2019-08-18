package T18_PathnameParse;

import java.util.regex.*;
import function.Scan;

/**
 * ����ļ�·�����ֽ���PathnameParse��
 * ʵ�ֽ�·�����ֽ�Ϊ���������š�·�����ļ��������֡�
 * ����, c:\windows\system32\cmd.exe 
 * �ɷֽ�Ϊ��c:\��,��windows\system32\���͡�cmd.exe����
 * @author ��ҹ֮��
 *
 */

public class PathnameParse {

	public static void main(String[] args) {
		String str=Scan.next("Path Name=");
		String s1="",s2="",s3="";
		Matcher m=Pattern.compile("([^\\\\]*)[\\\\]").matcher(str);
		if(m.find()) s1=m.group(0);
		str = m.replaceFirst("");
		m=Pattern.compile("(.*)[\\\\]").matcher(str);
		if(m.find()) s2=m.group(0);
		s3 = m.replaceFirst("");
		System.out.println("����������:\t"+s1);
		System.out.println("·��:\t\t"+s2);
		System.out.println("�ļ���:\t\t"+s3);
	}

}
