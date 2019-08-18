
public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,c=1,b;
		int h=(int)5.5+-3+--a;
		System.out.println(h); 
		h=~h;
		System.out.println(h); 
		int i=(0b1010)&(0b1011);   //把倒数第3位化为0
		System.out.println(i); 
		i=(0b1010)^(0b0100);
		System.out.println(i); 
		i=-(0b1000)>>1;
		System.out.println(i); 
		i=-(0b1000)>>>1;
		System.out.println(i); 
		i=(-(0b1000)>>>1)^(-(0b1000)>>1);
		System.out.println(i);
		a=b=c=1;
		a=b=c++;
		System.out.println(b);
	}

}
