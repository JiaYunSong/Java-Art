package object;

//Object 根类   所有类都继承了它
//Object里的equals()重写后hashCode()和toString()也要重写


public class Object_using {
	int num=0;
	public boolean equals(Object_using a)
	{
		if(num==a.num) return true;
		else return false;
	}
	//protect void finalize()  没有被引用时自动析构
	public int hashCode()
	{
		return num;
	}
	public String toString()
	{
		return "object_using is "+num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object_using a=new Object_using();
		Object_using b=new Object_using();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.toString());
	}

}
