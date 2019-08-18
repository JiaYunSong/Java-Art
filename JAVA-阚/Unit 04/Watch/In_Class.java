import lib1.lib2.Clock_plus;

public class In_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock_plus cp=new Clock_plus();
		Clock_plus.Clock_in ci=cp.new Clock_in();
		ci.call();
		//如何使用类中类
		
		cp.Clock_pa();
		//含有局部类
		
		cp.Clock_nu();
		//含有匿名类
		
		cp.Clock_nu_etc();
		//含有匿名类简写
	}

}
