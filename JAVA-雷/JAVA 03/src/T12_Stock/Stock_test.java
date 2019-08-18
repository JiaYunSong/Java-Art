package T12_Stock;

import function.Scan;

public class Stock_test {
	
	public static void main(String[] args) {
		new Scan();
		Stock s=new Stock("風の夢");
		System.out.println("\n\n进货\n-----------------------------");
		s.stockPurchase();
		System.out.println("\n\n销售\n-----------------------------");
		s.sale();
		s.showContent();
//		s.showInventory();
	}
	
}
