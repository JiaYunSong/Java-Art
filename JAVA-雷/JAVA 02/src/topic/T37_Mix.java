package topic;

/**
 * ����ʾ��������λ����˵���һ����λ������һ����λ���� 
 ���û���޶����������������Ӻܶࡣ 
 ��Ŀǰ���޶��ǣ���9�����飬��ʾ1~9��9�����֣�������0�� 
 ����ʽ��1��9��ÿ�����ֳ�����ֻ����һ�Σ� 
 ���磺 
46 x 79 = 23 x158
 54 x 69 = 27 x 138
 54 x 93 = 27 x186
 .....
���̣�������п��ܵ������ 
 ע�⣺ 
 ��ߵ���������������ͬһ��������Ҫ�ظ������ 
 ��ͬ���������˳����Ҫ 
 * @author ��ҹ֮��
 *
 */

public class T37_Mix {
	
	public static void main(String[] args) {
		int a=10,b,c,d;
		for(; a<100; a++)
			for(b=a; b<100; b++)
				for(c=10; c<100; c++) {
					d=a*b/c;
					if(d>99 && d==(double)a*b/c) {
						boolean yn=true;
						String NUM[]= {Integer.toString(a),Integer.toString(b),Integer.toString(c),Integer.toString(d)};
						String num="0";
						for(String A:NUM)
							for(char x:A.toCharArray())
								if(num.contains(Character.toString(x))) yn=false;
								else num=num+Character.toString(x);
						if(yn) System.out.println(a+"x"+b+"="+c+"x"+d);
					}
				}
	}
	
}
