public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte(8) short(16) int(32) long(64)
		// float double
		// char
		// boolean
		int a=20;
		int b=-020;         //可以直接写，像Python
		int c=0x20;
		int d=-0b1010;
		System.out.println(a+" "+b+" "+c+" "+d);
		long e=20L;         // 20l
		System.out.println(e);
		double f=20.5F;     // 20.5f
		double g=2.05E4;    // 2.05e4
		System.out.println(f+" "+g);
		final int aa=1;     //Java没有#define,只有只读
		//   aa=5，   aa只能写入一次！
		//   未初始化的所有变量都为null
		//   java变量名可以包含$
		System.out.println(aa);
	}

}
