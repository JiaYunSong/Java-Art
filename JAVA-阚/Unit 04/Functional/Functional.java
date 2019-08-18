import lik1.func_class;
import lik1.lik2._func_inter;

public class Functional {   //匿名方法

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func_class fu1=new func_class();
		//new的是功能类对象，本质就是一个方法
		fu1.a();
		//功能类对象方法
		
		_func_inter fu=new _func_inter() {
			public void a() {
				// TODO Auto-generated method stub
				System.out.println("匿名类函数覆盖！");
			}
		};     //匿名类简化代码
		fu.a();
	}

}