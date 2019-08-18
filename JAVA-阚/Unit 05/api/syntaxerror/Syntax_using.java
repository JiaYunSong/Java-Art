package syntaxerror;

import java.util.Scanner;


//  try/throw/catch 与c++相同
//  遇到throw跳到catch
//  RuntimeException为运行时异常类，
//  RuntimeException a=new RuntimeException("xxxxx");
//  a.getMessage()为String

public class Syntax_using {
	
	//如果删除static则报错，语法错误
	static int Div(int n)
	{
		int result;
		if(n==0) throw new RuntimeException("N is 0!");
		result=100/n;
				//改成*n则为语义错误
				// /0为运行时错误
		return result;
	}

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		try {
			int N;
			Scanner sc=new Scanner(System.in);
			N=sc.nextInt();
			int retValue=Div(N);
			System.out.println(retValue);
			sc.close();
		}
		catch(RuntimeException a){
			System.out.println(a.getMessage());
			throw new MyException("ERROR",a.getMessage());
		}
		finally{
			System.out.println("Is good!!!");
		}
	}
}
