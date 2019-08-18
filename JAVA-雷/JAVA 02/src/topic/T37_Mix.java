package topic;

/**
 * 它表示：两个两位数相乘等于一个两位数乘以一个三位数。 
 如果没有限定条件，这样的例子很多。 
 但目前的限定是：这9个方块，表示1~9的9个数字，不包含0。 
 该算式中1至9的每个数字出现且只出现一次！ 
 比如： 
46 x 79 = 23 x158
 54 x 69 = 27 x 138
 54 x 93 = 27 x186
 .....
请编程，输出所有可能的情况！ 
 注意： 
 左边的两个乘数交换算同一方案，不要重复输出！ 
 不同方案的输出顺序不重要 
 * @author 黎夜之梦
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
