package T12_Stock;

import function.Scan;

public class Stock_test {
	
	public static void main(String[] args) {
		new Scan();
		Stock s=new Stock("�L�Ή�");
		System.out.println("\n\n����\n-----------------------------");
		s.stockPurchase();
		System.out.println("\n\n����\n-----------------------------");
		s.sale();
		s.showContent();
//		s.showInventory();
	}
	
}
