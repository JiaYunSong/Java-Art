package T10_Accoun;

/**
 * ����ʻ��࣬������Accoun����������У�
		id��int���ͣ�˽�У�Ĭ��ֵ0���洢�ʻ�ID��
		balance��double���ͣ�˽�У�Ĭ��ֵ0���洢�ʻ���
		annualInterestRate��double���ͣ�˽�У�Ĭ��ֵ0���洢�����ʻ������ʡ�
		dateCreated��String���ͣ�˽�С��洢�ʻ��Ŀ������ڡ�
		����Ĭ���ʻ����޲������췽����
		������ID�����Ϊ��ʼ���ݴ����ʻ��Ĺ��췽����
		���ʺ��޸�id��balance��annualInterestRate��ķ�����
		dateCreated��ķ��ʷ�����
		getMonthlyInterestRate������������Ϣ��
		withDraw��������������Ҫָ��������
		deposit������������
 * @author ��ҹ֮��
 *
 */

public class Accoun {
	private int id=0;							//�洢�ʻ�ID
	private double balance=0;					//�洢�ʻ����
	private double annualInterestRate=0;		//�洢�����ʻ�������
	private String dateCreated="20190712";		//�洢�ʻ��Ŀ�������
	
	public Accoun() {}							//Ĭ���ʻ����޲������췽��
	public Accoun(int ID,int BALANCE) {			//������ID�����Ϊ��ʼ���ݴ����ʻ��Ĺ��췽��
		id=ID;
		balance=BALANCE;
	}
	
	public void set(int i,double b,double a) {	//���ʺ��޸�id��balance��annualInterestRate��ķ���
		id=i;
		balance=b;
		annualInterestRate=a;
	}
	public String getdateCreated() {			//dateCreated��ķ��ʷ���
		return dateCreated;
	}
	public double getMonthlyInterestRate() {	//getMonthlyInterestRate������������Ϣ
		return annualInterestRate;
	}
	public void withDraw(double dec) {			//withDraw��������������Ҫָ���������
		balance-=dec;
	}
	public void deposit(double inc) {			//deposit����������
		balance-=inc;
	}
	
	protected int getID() {
		return id;
	}
	protected double getBALANCE() {
		return balance;
	}
}
