package lib1;
import java.util.Scanner;

public class Rectangleusing {
	public static class Rectangleuse
	{
		private double a=1,b=1;
		private double Area()
		{return a*b;}
		private double Len()
		{return 2*(a+b);}
		
		public void Input()
		{
			Scanner sc=new Scanner(System.in);
			a=sc.nextDouble();
			b=sc.nextDouble();
			sc.close();
		}
		public void Output()
		{
			System.out.println("Area is "+Area());
			System.out.println("Len is "+Len());
		}
		public void Set(double aa,double bb)
		{
			this.a=aa;
			this.b=bb;
		}
		public static Rectangleuse seta(Rectangleuse re,int a)
		{
			num++;
			System.out.println(num);
			re.Set(a, re.b);
			return re;
		}
		
		private static int num=0;
		public static void num_plus()
		{
			num++;
			System.out.println(num);
		}
	}	
		
		
		
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangleuse obj=new Rectangleuse();
		obj.Input();
		obj.Output();
		
		Rectangleuse.num_plus();
		Rectangleuse.num_plus();
		
		Rectangleuse obj1=obj;
		obj1=Rectangleuse.seta(obj,4);
		obj1.Output();
		obj.Output();
		
		Rectangleuse rd[]=new Rectangleuse[3];
		for(Rectangleuse a:rd)
		{
			a=new Rectangleuse();
			a.Output();
		}
	}
}
