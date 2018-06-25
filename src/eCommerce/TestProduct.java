package eCommerce;

public class TestProduct {

	public static void main(String[] args) throws DecreaseQuantityException {
		// TODO Auto-generated method stub
		
		//public Product(String code, double price, String description
		Product p = new Product("12",12.50,"olio");
		
		p.decreasesQuantity();
		
		//public Product(String code, double price, String description, int quantity)
		Product p1 = new Product("13",12.50,"vino",3);
		
		p1.decreasesQuantity();
		
		
		
	}

}
