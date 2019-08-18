package T01_Input;

import java.io.IOException;

public class Input_test {

	public static void main(String[] args) {
		Input in=new Input();
		int a;
		double b;
		boolean c;
		try {
			a=in.inputInteger();
			b=in.inputDouble();
			c=in.inputBoolean();
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
