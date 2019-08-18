package lib1.lib2;

import lib1.lib2.lib3.Clock;
import lib1.lib2.lib3._Callable;
import lib1.lib2.lib3._Positionable;

public class AI_Clock extends Clock implements _Callable,_Positionable
{
	public void answer()
	{
		System.out.println("AI_Clock is calling!");
	}
}
