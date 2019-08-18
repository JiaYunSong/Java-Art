
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iArray[]= {2,3,4};
		int aRef[]=iArray;
		System.out.println(aRef.length);
		System.out.println(aRef[0]);
		
		for(int x:iArray)
			System.out.print(x+" ");
		System.out.print("\n");
		System.out.println(aRef[-1]);  //下标错误不能被检查出来
	}
}