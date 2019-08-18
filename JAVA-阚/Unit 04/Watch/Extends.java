import lib1.ClockMulti;
import lib1.lib2.*;
import lib1.lib2.lib3.Clock;

public class Extends
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ClockMulti t=new ClockMulti();
		t.set(1, 2, 3, 4, 5, 6);
		System.out.println("ClockMulti is ");
		t.show();
		
		Clock t1=new Clock();
		t1.set(5,5,5);
		t.set(1, t1);
		System.out.println("\nClockMulti is ");
		t.show();
		
		Clock_human tm=new Clock_human("Java",2,2,2);
		System.out.println("\nClock_human is ");
		tm.show();
		tm.set("Tu Tu");
		tm.set(6,6,6);
		System.out.println("\nClock_human is ");
		tm.show();
		tm.show_left();
		
		System.out.println("\nClock_main is ");
		Clock_main(t1);
		//Clock_main(t); is error!!!没有继承
		Clock_main(tm);   //继承了，可以用
		
		System.out.println("\nChange is ");
		Clock tmx=new Clock_human(tm);
		Clock_main(tmx);
		//tmx.show_left(); is error!!!子类新添加成员不能访问
		
		//abstract 与C++中的 virtual 用法相同
		//抽象类前需要加 abstract
		//有一个以上的抽象函数的类都叫抽象类
		//public abstract double set(); 为抽象方法的签名
	}

	private static void Clock_main(Clock A) {
		// TODO Auto-generated method stub
		A.show();
	}
}
