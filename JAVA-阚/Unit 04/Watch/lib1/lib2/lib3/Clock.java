package lib1.lib2.lib3;

public class Clock {   //�������final���ܱ��̳�
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
	public void show()  //�������final�����ڼ̳�ʱ����
	{
		System.out.println(h+":"+m+":"+s);
	}
}