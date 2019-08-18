package lang;

import java.lang.String;

public class String_using {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("abc");  //是常量
		s+="def";                    //会生成一个新的，原来那一个不变
		System.out.println(s.compareTo("aaa"));   //ASCII码比较
		
		int x=5;
		double y=16.8;
		s=String.format("x=%d,y=%5.2f", x,y);  //与printf相似
		System.out.println(s);
		
		s="abcdEf";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());   //全部变大写返回
		System.out.println(s.indexOf("cd"));   //位置返回
		System.out.println(s.substring(1,3));  //取一段返回
		System.out.println(s.concat("gh"));    //连接返回
		System.out.println(s+"gh");
	}

}
