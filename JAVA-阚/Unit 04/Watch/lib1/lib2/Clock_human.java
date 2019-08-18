package lib1.lib2;

import lib1.lib2.lib3.Clock;

public class Clock_human extends Clock{
	protected String a="user";
	
	public Clock_human(){}
	public Clock_human(String user,int h,int m,int s)
	{
		super(h,m,s);
		a=user;
	}
	public Clock_human(Clock_human tx)
	{
		super(tx.h,tx.m,tx.s);
		a=tx.a;
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
