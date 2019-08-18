
public class Circulate {
	//while
	//for
	//用法和C++相同
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Lable1:for(i=1; ; i++)
			Lable2:for(j=1; ; j++)
			{
				if(i>9) break Lable1;
				System.out.print(i+"*"+j+"="+(i*j)+" ");
				if(j>=i)
				{
					System.out.print("\n");
					break Lable2;
				}
			}
	}
}
