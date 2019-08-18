package T12_Stock;

import function.Mathe;
import function.Scan;

/**
 * �±���һ�š������Ʒ��ϸ�ˡ�����д����������ϸ�˱��Java�ࡣ
 * ������KuCun��Ҫ���ṩ���»���������
 * ���ʣ�����ʵ����������𡢱�š���ҳ����Ϊ��ʼ����ʵ������KuCun��
 * ������𣬱�ţ��ʻ�ҳ�Ρ�Ʒ����񡢼�����λ�����ݵ��޸ĺͷ��ز�����
 * ��ϸ���������ӡ�ɾ�����޸ġ�
 * ��ϸ��������ң������ں�ժҪ���������������������ۡ�������ͣ������������ۺͽ��Ľ���
 * 
 * ��ʾ���鿴Java API �ĵ����˽�java.util���е��뼯�ϣ����飬��ϣ�������Լ����ڣ�ʱ����ص��ࡣ������ܻ��õ���AbstractList��һ�����ࡣ
 * 
 * @author ��ҹ֮��
 *
 */

public class Stock {
	public  String	title;				//����
	
	private String	category;			//���
	private String	number;				//���
	private int		totalPageNumber=0;	//��ҳ��
	private int		accountPages;		//�˻�ҳ��
	private String	nameSpecification;	//Ʒ�����
	private String	unitOfMeasurement;	//������λ
	private int 	Year;				//���
	
	private Content content[];			//����
	private Inventory	inventory[];	//�����Ϣ
	
	public Stock(String mes) {			//������ϸ��
		title=mes+"�����Ʒ��ϸ��";
		System.out.println("------------------------------");
		for(int i=0; i<15-title.length(); i++)
			System.out.print("  ");
		System.out.println(title);
		System.out.println("------------------------------");
		
		category=Scan.nextLine("���:\t\t\t");
		number=Scan.nextLine("���:\t\t\t");
		totalPageNumber=Scan.nextInt("��ҳ��:\t\t\t");
		accountPages=Scan.nextInt("�˻�ҳ��:\t\t");
		nameSpecification=Scan.next("Ʒ�����:\t\t");
		unitOfMeasurement=Scan.next("������λ:\t\t");
		Year=Scan.nextInt("���:\t\t\t");
		
		int $=Scan.nextInt("\n�Ƿ�Ԥ�ÿ�棿\n���� - 1   �� - 0��\nѡ�� = ");
		while($!=0 && $!=1)
			$=Scan.nextInt("�������\n�Ƿ�Ԥ�ÿ�棿\n���� - 1   �� - 0��\nѡ�� = ");
		if($==1) {
			$=Scan.nextInt("�����Ʒ������=\t\t");
			inventory=new Inventory[$];
			for(int i:Mathe.getIntArithmeticArray(0, $, 1))
				inventory[i]=new Inventory((i+1)+"����Ʒ");
		}
	}
	public void stockPurchase() {	//����
		if(content==null) {
			content=new Content[1];
			content[0]=new Content("����");
		}
		else {
			Content c[]=new Content[content.length + 1];
			System.arraycopy(content, 0, c, 0, content.length);
			c[content.length]=new Content("����");
			content=c;
		}
		
		if(inventory==null) {
			inventory=new Inventory[1];
			inventory[0]=new Inventory(
					content[content.length-1].summary, 
					content[content.length-1].stockPurchase.unitPrice, 
					content[content.length-1].stockPurchase.number);
			content[content.length-1].setBalance(inventory[0].number, inventory[0].unitPrice);
		}
		else {
			int yn=-1;
			for(int i=0; i<inventory.length; i++)
				if(content[content.length-1].summary.equals(inventory[i].summary)) {
					yn=i;
					break;
				}
			if(yn==-1) {
				Inventory in[]=new Inventory[inventory.length + 1];
				System.arraycopy(inventory, 0, in, 0, inventory.length);
				in[inventory.length]=new Inventory(
						content[content.length-1].summary, 
						content[content.length-1].stockPurchase.unitPrice, 
						content[content.length-1].stockPurchase.number);
				inventory=in;
				content[content.length-1].setBalance(inventory[inventory.length-1].number, inventory[inventory.length-1].unitPrice);
			}
			else {
				inventory[yn].stockPurchase(
						content[content.length-1].stockPurchase.number);
				content[content.length-1].setBalance(inventory[yn].number, inventory[yn].unitPrice);
			}
		}
	}
	public void sale() {	//����
		if(content==null) {
			content=new Content[1];
			content[0]=new Content("����");
		}
		else{
			Content c[]=new Content[content.length + 1];
			System.arraycopy(content, 0, c, 0, content.length);
			c[content.length]=new Content("����");
			content=c;
		}
		
		if(inventory==null) {
			System.out.println("������!");
		}
		else {
			int yn=-1;
			for(int i=0; i<inventory.length; i++)
				if(content[content.length-1].summary.equals(inventory[i].summary))
					yn=i;
			if(yn==-1)
				System.out.println("������!");
			else {
				inventory[yn].sale(
						content[content.length-1].stockPurchase.number);
				content[content.length-1].setBalance(inventory[yn].number, inventory[yn].unitPrice);
			}
		}
	}
	public void showContent() {			//��ʾ��ϸ��
		StockShow.f(number,Year,category,nameSpecification,unitOfMeasurement,totalPageNumber,accountPages,content);
	}
	public void showInventory() {		//��ʾ���
		System.out.println("��δ��ƣ�");
//		JFrame w=new JFrame();
//		w.setTitle("�����Ʒ��ϸ");
	}
}

/**
 * ����:
 * //time-ʱ��
 * //accountingVouchers-����ƾ֤
 * //summary-ժҪ
 * //stockPurchase-����
 * //sale-����
 * //public Content(String mes)-���������ݲɼ�
 * @author ��ҹ֮��
 *
 */
class Content{									//����
	public Time		time;							//ʱ��
	public AccountingVouchers accountingVouchers;	//����ƾ֤
	public String	summary;						//ժҪ
	public Data		stockPurchase;					//����
	public Data		sale;							//����
	public Data		balance=new Data(0,0);			//���
	
	public Content(String mes) {					//���������ݲɼ�
		time=new Time(mes);
		accountingVouchers=new AccountingVouchers(mes);
		summary=Scan.next("%������ժҪ->\n\tժҪ=\t\t");
		if(mes=="����") {
			stockPurchase=new Data("����");
			sale=new Data(0,0);
		}
		else if(mes=="����") {
			sale=new Data("����");
			stockPurchase=new Data(0,0);
		}
	}
	public void setBalance(int n,double u) {	//�½�������Ϣ
		balance.number=n;
		balance.unitPrice=u;
	}
}

/**
 * �����Ϣ:
 * //summary-����ժҪ
 * //unitPrice-����
 * //number-����
 * //public Inventory(String mes)-Ԥ�û�����Ϣ
 * //public Inventory(String su,double u,int n)-�½�������Ϣ
 * //public String stockPurchase(int n)-��Ʒ���
 * //public String sale(int n)-��Ʒ����
 * @author ��ҹ֮��
 *
 */
class Inventory{				//�����Ϣ
	public String	summary;		//����ժҪ
	public double	unitPrice;		//����
	public int		number;			//����
	
	public Inventory(String mes) {	//Ԥ�û�����Ϣ
		System.out.println("%������"+mes+"����Ϣ->");
		summary=Scan.next("\t����ժҪ:\t");
		unitPrice=Scan.nextInt("\t����=\t\t");
		number=Scan.nextInt("\t����=\t\t");
	}
	public Inventory(String su,double u,int n) {	//�½�������Ϣ
		summary=su;
		unitPrice=u;
		number=n;
	}
	
	public String stockPurchase(int n) {	//��Ʒ���
		number+=n;
		return summary+"���ɹ���";
	}
	public String sale(int n) {				//��Ʒ����
		if(number>=n) {
			number-=n;
			return summary+"����ɹ���";
		}
		else return summary+"��治�㣬����ʧ�ܣ�";
	}
}

/**
 * ʱ��:
 * //month-��
 * //day-��
 * //public Time(String mes)-���ݲɼ�
 * @author ��ҹ֮��
 *
 */
class Time{					//ʱ��
	public int	month;			//��
	public int	day;			//��
	
	public Time(String mes) {	//���ݲɼ�
		System.out.println("%������"+mes+"��ʱ��->");
		month=Scan.nextInt("\t��=\t\t");
		day=Scan.nextInt("\t��=\t\t");
	}
}

/**
 * ����ƾ֤:
 * //word-��
 * //number-��
 * @author ��ҹ֮��
 *
 */
class AccountingVouchers{	//����ƾ֤
	public String	word;		//��
	public int		number;		//��
	
	public AccountingVouchers(String mes) {	//���ݲɼ�
		System.out.println("%������"+mes+"����ƾ֤��Ϣ->");
		word=Scan.next("\t��=\t\t");
		number=Scan.nextInt("\t��=\t\t");
	}
}

/**
 * ��������:
 * //number-����
 * //unitPrice-����
 * //public Data(int	n,double u)-������
 * //public Data(String mes)-���ݲɼ�
 * //public double sumOfMoney()-���
 * @author ��ҹ֮��
 *
 */
class Data{						//��������
	public int		number;			//����
	public double	unitPrice;		//����
	
	public Data(int	n,double u) {	//������
		number=n;
		unitPrice=u;
	}
	public Data(String mes) {		//���ݲɼ�
		System.out.println("%��������"+mes+"�Ļ�������->");
		number=Scan.nextInt("\t����:\t\t");
		unitPrice=Scan.nextDouble("\t����:\t\t");
	}

	public double sumOfMoney() {	//���
		return number*unitPrice;
	};
}