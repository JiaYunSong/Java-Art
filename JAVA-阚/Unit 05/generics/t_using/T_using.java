package t_using;

import t_using.t_extends.T_extend;

public class T_using {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T_extend<Integer> a=new T_extend<Integer>(9);
		T_extend<Double> b=new T_extend<Double>(9.0);
		a.show();
		b.show();
		
		//T_extend<String> c=new T_extend<String>(9.0);
		//String isn't Number!
		
		T_extend<?> c=a;
		c.show();
		c=b;
		c.show();

		T_extend<? super Integer> d=a;
		d.show();
		//d=b; is error!!!
		
		T_extend<? extends Number> e=a;
		e.show();
		e=b;   //is OK!
	}

}
