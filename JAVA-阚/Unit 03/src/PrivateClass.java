import lib1.Rectangleusing.Rectangleuse;
class rea
{
	private int i=0;
	private int j=1;
	public rea(){}
	public rea(int ii,int jj)
	{
		i=ii;
		j=jj;
	}
	public void output()
	{
		System.out.println(i+" "+j);
	}
}



public class PrivateClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rea r1=new rea(1,2), r2=new rea();
		r1.output();
		r2.output();
		
		Rectangleuse obj=new Rectangleuse();
		obj.Input();
		obj.Output();
	}
}
