package annotation_using;

/**
 * using annotation;
 * @author ¿Ë“π÷Æ√Œ
 *
 */
@Annotation(version=666)
public class Annotation_using {
	private int a=0;
	/**
	 * show():a=num;
	 */
	public void show(int num)
	{
		System.out.println(a);
		a=num;
	}
	public static void main(String[] args) {
		Annotation_using a=new Annotation_using();
		a.show(5);
		a.show(6);
		a.show(9);
	}
}
