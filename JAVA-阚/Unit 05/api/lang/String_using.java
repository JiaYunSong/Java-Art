package lang;

import java.lang.String;

public class String_using {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("abc");  //�ǳ���
		s+="def";                    //������һ���µģ�ԭ����һ������
		System.out.println(s.compareTo("aaa"));   //ASCII��Ƚ�
		
		int x=5;
		double y=16.8;
		s=String.format("x=%d,y=%5.2f", x,y);  //��printf����
		System.out.println(s);
		
		s="abcdEf";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());   //ȫ�����д����
		System.out.println(s.indexOf("cd"));   //λ�÷���
		System.out.println(s.substring(1,3));  //ȡһ�η���
		System.out.println(s.concat("gh"));    //���ӷ���
		System.out.println(s+"gh");
	}

}
