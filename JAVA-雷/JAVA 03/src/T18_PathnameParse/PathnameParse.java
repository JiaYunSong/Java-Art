package T18_PathnameParse;

import java.util.regex.*;
import function.Scan;

/**
 * 设计文件路径名分解类PathnameParse，
 * 实现将路径名分解为驱动器符号、路径和文件名三部分。
 * 例如, c:\windows\system32\cmd.exe 
 * 可分解为“c:\”,“windows\system32\”和“cmd.exe”。
 * @author 黎夜之梦
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
		System.out.println("驱动器符号:\t"+s1);
		System.out.println("路径:\t\t"+s2);
		System.out.println("文件名:\t\t"+s3);
	}

}
