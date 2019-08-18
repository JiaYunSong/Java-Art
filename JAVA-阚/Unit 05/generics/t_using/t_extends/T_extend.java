package t_using.t_extends;

public class T_extend<T extends Number> {
	private T num;
	public T_extend(T n){
		num=n;
	}
	public void show(){
		System.out.println(num);
	}
}
