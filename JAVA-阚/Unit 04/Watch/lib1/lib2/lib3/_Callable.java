package lib1.lib2.lib3;

public interface _Callable {
	int pNumber = 1234;    //变量都是public static final
	default void call(int number)
	{
		System.out.println("Call in "+number);
	}
	void answer();
}
