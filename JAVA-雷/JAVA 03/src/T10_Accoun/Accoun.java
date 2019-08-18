package T10_Accoun;

/**
 * 设计帐户类，类名称Accoun，该类包含有：
		id域，int类型，私有，默认值0。存储帐户ID。
		balance域，double类型，私有，默认值0。存储帐户余额。
		annualInterestRate域，double类型，私有，默认值0。存储所有帐户的利率。
		dateCreated域，String类型，私有。存储帐户的开户日期。
		创建默认帐户的无参数构造方法。
		创建以ID和余额为初始数据创建帐户的构造方法。
		访问和修改id域、balance域、annualInterestRate域的方法。
		dateCreated域的访问方法。
		getMonthlyInterestRate方法返回月利息。
		withDraw方法，提款方法，需要指定款的数额。
		deposit方法，存款方法。
 * @author 黎夜之梦
 *
 */

public class Accoun {
	private int id=0;							//存储帐户ID
	private double balance=0;					//存储帐户余额
	private double annualInterestRate=0;		//存储所有帐户的利率
	private String dateCreated="20190712";		//存储帐户的开户日期
	
	public Accoun() {}							//默认帐户的无参数构造方法
	public Accoun(int ID,int BALANCE) {			//创建以ID和余额为初始数据创建帐户的构造方法
		id=ID;
		balance=BALANCE;
	}
	
	public void set(int i,double b,double a) {	//访问和修改id域、balance域、annualInterestRate域的方法
		id=i;
		balance=b;
		annualInterestRate=a;
	}
	public String getdateCreated() {			//dateCreated域的访问方法
		return dateCreated;
	}
	public double getMonthlyInterestRate() {	//getMonthlyInterestRate方法返回月利息
		return annualInterestRate;
	}
	public void withDraw(double dec) {			//withDraw方法，提款方法，需要指定款的数额
		balance-=dec;
	}
	public void deposit(double inc) {			//deposit方法，存款方法
		balance-=inc;
	}
	
	protected int getID() {
		return id;
	}
	protected double getBALANCE() {
		return balance;
	}
}
