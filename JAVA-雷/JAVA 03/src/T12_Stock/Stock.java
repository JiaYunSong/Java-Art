package T12_Stock;

import function.Mathe;
import function.Scan;

/**
 * 下表是一张《库存商品明细账》，请写出描述该明细账表的Java类。
 * 类名称KuCun，要求提供如下基本操作：
 * 建帐，即类实例化，用类别、编号、总页次做为初始数据实例化类KuCun。
 * 表项类别，编号，帐户页次、品名规格、计量单位等数据的修改和返回操作。
 * 明细数据项的添加、删除、修改。
 * 明细数据项查找（按日期和摘要）、计数（按数量、单价、金额）、求和（按进货，销售和结存的金额）。
 * 
 * 提示：查看Java API 文档，了解java.util包中的与集合，数组，哈希表，向量以及日期，时间相关的类。本题可能会用到象AbstractList类一样的类。
 * 
 * @author 黎夜之梦
 *
 */

public class Stock {
	public  String	title;				//标题
	
	private String	category;			//类别
	private String	number;				//编号
	private int		totalPageNumber=0;	//总页次
	private int		accountPages;		//账户页次
	private String	nameSpecification;	//品名规格
	private String	unitOfMeasurement;	//计量单位
	private int 	Year;				//年份
	
	private Content content[];			//内容
	private Inventory	inventory[];	//库存信息
	
	public Stock(String mes) {			//建立明细账
		title=mes+"库存商品明细表";
		System.out.println("------------------------------");
		for(int i=0; i<15-title.length(); i++)
			System.out.print("  ");
		System.out.println(title);
		System.out.println("------------------------------");
		
		category=Scan.nextLine("类别:\t\t\t");
		number=Scan.nextLine("编号:\t\t\t");
		totalPageNumber=Scan.nextInt("总页次:\t\t\t");
		accountPages=Scan.nextInt("账户页次:\t\t");
		nameSpecification=Scan.next("品名规格:\t\t");
		unitOfMeasurement=Scan.next("计量单位:\t\t");
		Year=Scan.nextInt("年份:\t\t\t");
		
		int $=Scan.nextInt("\n是否预置库存？\n【是 - 1   否 - 0】\n选择 = ");
		while($!=0 && $!=1)
			$=Scan.nextInt("输入错误！\n是否预置库存？\n【是 - 1   否 - 0】\n选择 = ");
		if($==1) {
			$=Scan.nextInt("库存商品种类数=\t\t");
			inventory=new Inventory[$];
			for(int i:Mathe.getIntArithmeticArray(0, $, 1))
				inventory[i]=new Inventory((i+1)+"号商品");
		}
	}
	public void stockPurchase() {	//进货
		if(content==null) {
			content=new Content[1];
			content[0]=new Content("进货");
		}
		else {
			Content c[]=new Content[content.length + 1];
			System.arraycopy(content, 0, c, 0, content.length);
			c[content.length]=new Content("进货");
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
	public void sale() {	//销售
		if(content==null) {
			content=new Content[1];
			content[0]=new Content("销售");
		}
		else{
			Content c[]=new Content[content.length + 1];
			System.arraycopy(content, 0, c, 0, content.length);
			c[content.length]=new Content("销售");
			content=c;
		}
		
		if(inventory==null) {
			System.out.println("库存错误!");
		}
		else {
			int yn=-1;
			for(int i=0; i<inventory.length; i++)
				if(content[content.length-1].summary.equals(inventory[i].summary))
					yn=i;
			if(yn==-1)
				System.out.println("库存错误!");
			else {
				inventory[yn].sale(
						content[content.length-1].stockPurchase.number);
				content[content.length-1].setBalance(inventory[yn].number, inventory[yn].unitPrice);
			}
		}
	}
	public void showContent() {			//显示明细账
		StockShow.f(number,Year,category,nameSpecification,unitOfMeasurement,totalPageNumber,accountPages,content);
	}
	public void showInventory() {		//显示库存
		System.out.println("还未设计！");
//		JFrame w=new JFrame();
//		w.setTitle("库存商品明细");
	}
}

/**
 * 内容:
 * //time-时间
 * //accountingVouchers-记账凭证
 * //summary-摘要
 * //stockPurchase-进货
 * //sale-销售
 * //public Content(String mes)-进出库数据采集
 * @author 黎夜之梦
 *
 */
class Content{									//内容
	public Time		time;							//时间
	public AccountingVouchers accountingVouchers;	//记账凭证
	public String	summary;						//摘要
	public Data		stockPurchase;					//进货
	public Data		sale;							//销售
	public Data		balance=new Data(0,0);			//结存
	
	public Content(String mes) {					//进出库数据采集
		time=new Time(mes);
		accountingVouchers=new AccountingVouchers(mes);
		summary=Scan.next("%请输入摘要->\n\t摘要=\t\t");
		if(mes=="进货") {
			stockPurchase=new Data("进货");
			sale=new Data(0,0);
		}
		else if(mes=="销售") {
			sale=new Data("销售");
			stockPurchase=new Data(0,0);
		}
	}
	public void setBalance(int n,double u) {	//新建货物信息
		balance.number=n;
		balance.unitPrice=u;
	}
}

/**
 * 库存信息:
 * //summary-货物摘要
 * //unitPrice-单价
 * //number-数量
 * //public Inventory(String mes)-预置货物信息
 * //public Inventory(String su,double u,int n)-新建货物信息
 * //public String stockPurchase(int n)-商品入库
 * //public String sale(int n)-商品出库
 * @author 黎夜之梦
 *
 */
class Inventory{				//库存信息
	public String	summary;		//货物摘要
	public double	unitPrice;		//单价
	public int		number;			//数量
	
	public Inventory(String mes) {	//预置货物信息
		System.out.println("%请输入"+mes+"的信息->");
		summary=Scan.next("\t货物摘要:\t");
		unitPrice=Scan.nextInt("\t单价=\t\t");
		number=Scan.nextInt("\t数量=\t\t");
	}
	public Inventory(String su,double u,int n) {	//新建货物信息
		summary=su;
		unitPrice=u;
		number=n;
	}
	
	public String stockPurchase(int n) {	//商品入库
		number+=n;
		return summary+"入库成功！";
	}
	public String sale(int n) {				//商品出库
		if(number>=n) {
			number-=n;
			return summary+"出库成功！";
		}
		else return summary+"库存不足，出库失败！";
	}
}

/**
 * 时间:
 * //month-月
 * //day-日
 * //public Time(String mes)-数据采集
 * @author 黎夜之梦
 *
 */
class Time{					//时间
	public int	month;			//月
	public int	day;			//日
	
	public Time(String mes) {	//数据采集
		System.out.println("%请输入"+mes+"的时间->");
		month=Scan.nextInt("\t月=\t\t");
		day=Scan.nextInt("\t日=\t\t");
	}
}

/**
 * 记账凭证:
 * //word-字
 * //number-号
 * @author 黎夜之梦
 *
 */
class AccountingVouchers{	//记账凭证
	public String	word;		//字
	public int		number;		//号
	
	public AccountingVouchers(String mes) {	//数据采集
		System.out.println("%请输入"+mes+"记账凭证信息->");
		word=Scan.next("\t字=\t\t");
		number=Scan.nextInt("\t号=\t\t");
	}
}

/**
 * 货物数据:
 * //number-数量
 * //unitPrice-单价
 * //public Data(int	n,double u)-创建用
 * //public Data(String mes)-数据采集
 * //public double sumOfMoney()-金额
 * @author 黎夜之梦
 *
 */
class Data{						//货物数据
	public int		number;			//数量
	public double	unitPrice;		//单价
	
	public Data(int	n,double u) {	//创建用
		number=n;
		unitPrice=u;
	}
	public Data(String mes) {		//数据采集
		System.out.println("%请输入已"+mes+"的货物数据->");
		number=Scan.nextInt("\t数量:\t\t");
		unitPrice=Scan.nextDouble("\t单价:\t\t");
	}

	public double sumOfMoney() {	//金额
		return number*unitPrice;
	};
}