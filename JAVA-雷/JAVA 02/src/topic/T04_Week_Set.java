package topic;
/**
 * 假如今天是星期二，100天后将是星期几？
 * @author 黎夜之梦
 *
 */
public class T04_Week_Set {
	public static void main(String[] args) {
		int i=1,j=0;
		for(; j<100; i++,j++)
			if(i==7) i=0;
		String w[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println(w[i]);
	}
}