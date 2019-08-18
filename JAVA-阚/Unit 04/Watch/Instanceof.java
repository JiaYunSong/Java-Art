import lib1.Clock_human_dog;
import lib1.lib2.Clock_human;
import lib1.lib2.lib3.Clock;

public class Instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock_human tm=new Clock_human("Java",2,2,2);
		Clock tmx=new Clock_human(tm);
		System.out.println("tmx->human?       "+(tmx instanceof Clock_human));
		System.out.println("tm->Clock?        "+(tm instanceof Clock));
		System.out.println("tm->human_dog?    "+(tm instanceof Clock_human_dog));
	    //只能判断有继承关系的两个类
	}
}
