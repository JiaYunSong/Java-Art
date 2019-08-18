package lib1.lib2;

import lib1.lib2.lib3.Clock;
import lib1.lib2.lib3._Callable;
import lib1.lib2.lib3._Positionable;

public class PC_Clock extends Clock implements _Callable,_Positionable
{
	public void answer()
	{
		System.out.println("PC_Clock is calling!");
	}
}
