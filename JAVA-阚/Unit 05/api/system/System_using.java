package system;

public class System_using {
	
	//System.in/out/err�൱��C++��cin/cout/cerr
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���Զ�ȡϵͳ����
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.name"));
		
		//���鸴��
		int x[]= {1,2,3,4,5};
		int y[]=new int[4];
		//x=y is error!!!
		System.arraycopy(x, 2, y, 1, 3);
		System.out.println(y[0]+","+y[1]+","+y[2]+","+y[3]);
		
		//ϵͳʱ�� 1970/7/7 0:0:0�����ڵĺ�����
		System.out.println(System.currentTimeMillis());
		
		System.gc();    //����
		System.exit(0);
	}
}
