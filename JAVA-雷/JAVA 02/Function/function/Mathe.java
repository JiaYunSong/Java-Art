package function;

import java.math.BigDecimal;

/**
 * ��ѧ�ຯ��
 * @author ��ҹ֮��
 */
public class Mathe {
	/**
	 * 1^2+2^2+....+N^2
	 * @author ��ҹ֮��
	 */
	static public int Sum_n2(int k) {
		int sum=0;
		for(int i=1; i<=k; i++)
			sum=sum+i*i;
		return sum;
	}
	/**
	 * n!
	 * @author ��ҹ֮��
	 */
	static public double Alg_n$(int k) {
		if(k==0) return 1;
		double sum=1;
		for(int i=1; i<=k; i++)
			sum=sum*i;
		return sum;
	}
	/**
	 * n^k
	 * @author ��ҹ֮��
	 */
	static public double Alg_nCubek(double n,int k) {
		if(k==0||n==1) return 1;
		if(n==0) return 0;
		double sum=n;
		for(int i=1; i<k; i++)
			sum=sum*n;
		return sum;
	}
	/**
	 * Int ����
	 * @author ��ҹ֮��
	 */
	static public int[] IntSort(int a[]) {
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[i]>a[j]){
					int n=a[i];
					a[i]=a[j];
					a[j]=n;
				}
		return a;
	}
	/**
	 * Int ����
	 * p,С��0Ϊ���򣬴���0Ϊ����
	 * @author ��ҹ֮��
	 */
	static public int[] IntSort(int a[],double p) {
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[i]*p>a[j]*p){
					int n=a[i];
					a[i]=a[j];
					a[j]=n;
				}
		return a;
	}
	/**
	 * Double ����
	 * @author ��ҹ֮��
	 */
	static public double[] DoubleSort(double a[]) {
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[i]>a[j]){
					double n=a[i];
					a[i]=a[j];
					a[j]=n;
				}
		return a;
	}
	/**
	 * Double ����
	 * p,С��0Ϊ���򣬴���0Ϊ����
	 * @author ��ҹ֮��
	 */
	static public double[] DoubleSort(double a[],double p) {
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[i]*p>a[j]*p){
					double n=a[i];
					a[i]=a[j];
					a[j]=n;
				}
		return a;
	}
	/**
	 * Double[] ƽ����
	 * @author ��ҹ֮��
	 */
	static public double DoubleAverage(double a[]) {
		double ave=0;
		for(int i=0; i<a.length; i++)
			ave+=a[i];
		ave/=a.length;
		return ave;
	}
	/**
	 * Double[] ��λ��
	 * @author ��ҹ֮��
	 */
	static public double DoubleMedian(double a[]) {
		double b[]=Mathe.DoubleSort(a);
		if(b.length%2!=0)
			return b[b.length/2];
		else
			return (b[b.length/2]+b[b.length/2-1])/2;
	}
	/**
	 * Double[] ����
	 * @author ��ҹ֮��
	 */
	static public double DoubleVariance(double a[]) {
		double ave=Mathe.DoubleAverage(a);
		double var=0;
		for(int i=0; i<a.length; i++)
			var+=Mathe.Alg_nCubek(a[i]-ave, 2);
		var=Math.sqrt(var)/a.length;
		return var;
	}
	/**
	 * Double[] ��׼��
	 * @author ��ҹ֮��
	 */
	static public double DoubleStandardDeviation(double a[]) {
		double ave=Mathe.DoubleAverage(a);
		double std=0;
		for(int i=0; i<a.length; i++)
			std+=Math.abs(a[i]-ave);
		std/=a.length;
		return std;
	}
	/**
	 * ��Ԫһ�η���deta
	 */
	static public double abc_deta(double a,double b,double c) {
		return Math.sqrt(b*b-4*a*c);
	}
	/**
	 * ��Ԫһ�η���X1
	 */
	static public double abc_X1(double a,double b,double c) {
		double deta=abc_deta(a,b,c);
		return (-b+deta)/(2*a);
	}
	/**
	 * ��Ԫһ�η���X2
	 */
	static public double abc_X2(double a,double b,double c) {
		double deta=abc_deta(a,b,c);
		return (-b-deta)/(2*a);
	}
	/**
	 * ���int��������
	 */
	public static int IntRandom() {
		return (int)(Math.random()*((long)Integer.MAX_VALUE-Integer.MIN_VALUE)+Integer.MIN_VALUE);
	}
	/**
	 * ���int��������
	 * ��Χ=��a,b��
	 */
	public static int IntRandom(int a,int b) {
		return (int)(Math.random()*((long)b-a)+a);
	}
	/**
	 * Int��������µ�Ԫ
	 */
	public static int[] IntArrayPlus(int[] a,int p) {
		int[] a2 = new int[a.length + 1];
		System.arraycopy(a, 0, a2, 0, a.length);
		a2[a.length] = p;
		return a2;
	}
	/**
	 * Int[] �Ȳ�����
	 */
	public static int[] getIntArithmeticArray(int first,int num,int step) {
		int a[]= new int[num];
		for(int i=first,j=0; j<num; j++,i+=step)
			a[j]=i;
		return a;
	}
	/**
	 * Double��������µ�Ԫ
	 */
	public static double[] DoubleArrayPlus(double[] a,double p) {
		double[] a2 = new double[a.length + 1];
		System.arraycopy(a, 0, a2, 0, a.length);
		a2[a.length] = p;
		return a2;
	}
	/**
	 * String������µ�Ԫ
	 */
	public static String StringArrayPlus(String a,char p) {
		return a+Character.toString(p);
	}
	/**
	 * �Ƿ�Ϊ����
	 */
	public static boolean IsPrime(int num) {
		if(num<2) return false;
		if(num==2) return true;
		boolean yn=true;
		for(int i=2; i<num; i++)
			if(num%i==0) {
				yn=false;
				break;
			}
		return yn;
	}
	/**
	 * �Ƿ�Ϊ������
	 */
	public static boolean IsPalindrome(int num) {
		if(num<=0) return false;
		if(num<10) return true;
		boolean yn=true;
		String NUM=Integer.toString(num);
		for(int i=0; i<NUM.length()/2; i++)
			if(NUM.charAt(i)!=NUM.charAt(NUM.length()-i-1))
				yn=false;
		return yn;
	}
	/**
	 * Double ��������
	 */
	public static double DoubleKill(double num,int Acc){
		BigDecimal bg = new BigDecimal(num);
		return bg.setScale(Acc, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	/**
	 * ������
	 */
	public static double IterMethods(double a,MatheF f,int Acc) {
		double x=100,k=1,accuracy=Alg_nCubek(0.1,Acc);
		while(Math.abs(x-k)>accuracy) {
			x=k;
			k=f.x(x, a);
		}
		x=DoubleKill(k,Acc);
		return x;
	}
	/**
	 * �Ƿ���Ԫ��num(���Է�/int)
	 */
	public static boolean Find_Line(int a[],int num) {
		if(a.length==0) return false;
		boolean yn=false;
		for(int i:a)
			if(i==num) {
				 yn=true;
				 break;
			}
		return yn;
	}
	/**
	 * �Ƿ���Ԫ��num(���ַ�/int)
	 */
	public static boolean Find_Pair(int a[],int num) {
		if(a.length==0||a.length==1&&a[0]!=num) return false;
		if(a[0]==num) return true;
		int b[]=new int[a.length];
		for(int i=0; i<a.length; i++)
			b[i]=a[i];
		Mathe.IntSort(b);
		boolean yn=true;
		int min=0,max=b.length-1;
		int ave=(min+max)/2;
		while(b[ave]!=num) {
			if(b[ave]<num) min=ave+1;
			else if(b[ave]>num) max=ave-1;
			ave=(min+max)/2;
			if(min>max) return false;
		}
		return yn;
	}
	/**
	 * ��n��Fibonancii����
	 */
	public static int Fibonancii(int n) {
		if(n<2) return 1;
		else {
			int num1=1, num2=1;
			while(n>2) {
				num1+=num2;
				num1=num1^num2;
				num2=num1^num2;
				num1=num1^num2;
				n--;
			}
			return num2;
		}
	}
	/**
	 * ��n��Fibonancii����
	 */
	public static boolean IsNarcissistiNumber(int n) {
		if(n<100 || n>999) return false;
		int a=n/100;
		int b=n/10-a*10;
		int c=n-b*10-a*100;
		if(Mathe.Alg_nCubek(a, 3)+Mathe.Alg_nCubek(b, 3)+Mathe.Alg_nCubek(c, 3)==a*100+b*10+c)
			return true;
		else return false;
	}
}