package image_file;

public class Num_using {
	public static void main(String[] args) {
		int num1[][];
		int num2[]= {1,2,2,3};
		num1=new int[][]{num2,{1,2}};
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1[0][0]);
	}
}