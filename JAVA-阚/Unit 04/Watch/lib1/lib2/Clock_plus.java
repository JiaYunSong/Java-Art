package lib1.lib2;

import lib1.lib2.lib3.Clock;

public class Clock_plus extends Clock {
	public class Clock_in{   //�ڲ���
		public void call()
		{
			System.out.println("I am small clock!");
		}
	}
	public void Clock_pa()
	{
		class Clock_part{   //�ֲ��࣬��Ȩ�ޣ��������������
			public void call()
			{
				System.out.println("I am part clock!");
			}
			//�������к������ʵĶ�ֻ����final
		}
		Clock_part cp=new Clock_part();
		cp.call();
	}
	public void Clock_nu()
	{
		Clock cp=new Clock(){   //�����࣬һ����
			public void show()
			{
				System.out.println("I am unname clock!");
			}
			//�������к���ֻ������Clock��
		};
		cp.show();
	}
	public void Clock_nu_etc()
	{
		(new Clock(){           //�������д
			public void show()
			{
				System.out.println("I am unname and no iter's clock!");
			}
		}).show();
	}
}
