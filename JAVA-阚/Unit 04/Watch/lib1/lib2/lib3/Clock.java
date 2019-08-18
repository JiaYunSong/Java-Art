package lib1.lib2.lib3;

public class Clock {   //如果加上final则不能被继承
	protected int h,m,s;
	
	public Clock()
	{
		h=0;m=0;s=0;
	}
	public Clock(int hh,int mm,int ss)
	{
		h=hh;m=mm;s=ss;
	}
	
	public void set(int hh,int mm, int ss)
	{
		h=hh;
		m=mm;
		s=ss;
	}
	public void set(Clock t)
	{
		h=t.h;
		m=t.m;
		s=t.s;
	}
	public void show()  //如果加上final则不能在继承时更改
	{
		System.out.println(h+":"+m+":"+s);
	}
}