import lib1.lib2.AI_Clock;
import lib1.lib2.PC_Clock;
import lib1.lib2.lib3._Callable;
import lib1.lib2.lib3._Positionable;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interface + implements 
		//(预定义用default，变量都是public static final)
		//class + extends
		AI_Clock ta=new AI_Clock();
		PC_Clock tp=new PC_Clock();
		Clock_call(ta,6666);
		Clock_Pos(ta);
		Clock_call(tp,8888);
		Clock_Pos(tp);
	}
	private static void Clock_call(_Callable c,int num) {
		// TODO Auto-generated method stub
		c.call(num);
		c.answer();
	}

	private static void Clock_Pos(_Positionable p) {
		// TODO Auto-generated method stub
		p.showPosition();
	}
}
