package lib1.lib2.lib3;

public interface _Callable {
	int pNumber = 1234;    //��������public static final
	default void call(int number)
	{
		System.out.println("Call in "+number);
	}
	void answer();
}
