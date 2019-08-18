
public class MaxMore {
	public static int maxmore(int...a)
	{
		if(a.length<1) return 0;
		int result=a[0];
		for(int x:a)
			if(x>result) result=x;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=maxmore();
		int b=maxmore(1,4,7,9);
		System.out.println(a+" "+b);
	}

}
