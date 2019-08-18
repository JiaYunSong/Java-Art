package lib1;

import lib1.lib2.Clock_human;

public class Clock_human_dog extends Clock_human{
	
	public Clock_human_dog(){}
	public Clock_human_dog(String user,int h,int m,int s)
	{
		super(user,h,m,s);
	}
	public Clock_human_dog(Clock_human_dog tx)
	{
		super(tx.a,tx.h,tx.m,tx.s);
	}
	public void set(String user)
	{
		a=user;
	}
	public void show()
	{
		System.out.println(a+"->"+h+":"+m+":"+s);
	}
	public void show_left()
	{
		super.show();
	}
}
