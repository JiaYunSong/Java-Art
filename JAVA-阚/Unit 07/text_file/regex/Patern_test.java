package regex;

import java.util.regex.*;

public class Patern_test {
	public static void main(String[] args) {
		String str="one,two three,four    five";
		Pattern p=Pattern.compile("[, ]+");
		String words[]=p.split(str);
		System.out.println("\""+str+"\"的分词结果如下");
		for(String s:words)
			System.out.print("["+s+"]");
		System.out.println();
		
		str="\\w+([-_]\\w+)*@\\w+([-_.]\\w+)*.\\w+";
		String mail1="asskjh-ff@163.com";
		String mail2="asskjh.ff.@163.com";
		if(Pattern.matches(str, mail1)==true)
			System.out.println(mail1+"合法");
		else System.out.println(mail1+"不合法");
		if(Pattern.matches(str, mail2)==true)
			System.out.println(mail2+"合法");
		else System.out.println(mail2+"不合法");
		
		p=Pattern.compile(str);
		str=mail2+"\n"+mail1;
		Matcher m=p.matcher(str);
		while(m.find()==true) {
			int p1=m.start();int p2=m.end();
			System.out.println(p1+"-"+p2+":"+str.substring(p1, p2));
		}
		
		str=m.replaceAll("hhhhhh");
		System.out.println(str);
	}
}
