package lib1.lib2;

import lib1.lib2.lib3.Clock;

public class Clock_plus extends Clock {
	public class Clock_in{   //内部类
		public void call()
		{
			System.out.println("I am small clock!");
		}
	}
	public void Clock_pa()
	{
		class Clock_part{   //局部类，无权限，不能在外面访问
			public void call()
			{
				System.out.println("I am part clock!");
			}
			//里面所有函数访问的都只能是final
		}
		Clock_part cp=new Clock_part();
		cp.call();
	}
	public void Clock_nu()
	{
		Clock cp=new Clock(){   //匿名类，一次性
			public void show()
			{
				System.out.println("I am unname clock!");
			}
			//里面所有函数只能重载Clock的
		};
		cp.show();
	}
	public void Clock_nu_etc()
	{
		(new Clock(){           //匿名类简写
			public void show()
			{
				System.out.println("I am unname and no iter's clock!");
			}
		}).show();
	}
}
