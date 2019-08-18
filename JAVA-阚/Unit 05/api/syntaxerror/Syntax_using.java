package syntaxerror;

import java.util.Scanner;


//  try/throw/catch ��c++��ͬ
//  ����throw����catch
//  RuntimeExceptionΪ����ʱ�쳣�࣬
//  RuntimeException a=new RuntimeException("xxxxx");
//  a.getMessage()ΪString

public class Syntax_using {
	
	//���ɾ��static�򱨴��﷨����
	static int Div(int n)
	{
		int result;
		if(n==0) throw new RuntimeException("N is 0!");
		result=100/n;
				//�ĳ�*n��Ϊ�������
				// /0Ϊ����ʱ����
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
