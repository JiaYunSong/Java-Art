package lib1;
import lib1.lib2.lib3.Clock;

public class ClockMulti {
	Clock t1=new Clock(),t2=new Clock();
	public void set(int h1,int m1,int s1,int h2,int m2,int s2)
	{
		t1.set(h1, m1, s1);
		t2.set(h2, m2, s2);
	}
	public void set(int x,Clock tx)
	{
		if(x==1) t1.set(tx);
		if(x==2) t2.set(tx);
	}
	public void show()
	{
		System.out.print("t1=");
		t1.show();
		System.out.print("t2=");
		t2.show();
	}
}
