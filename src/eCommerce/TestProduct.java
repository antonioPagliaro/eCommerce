package eCommerce;

public class TestProduct {

	public static void main(String[] args) throws DecreaseQuantityException {
		// TODO Auto-generated method stub
		
		//public Product(String code, double price, String description, String categoria, int quantity)
		Product p = new Product("12",12.50,"olio","alimentari");
		
		//p.decreasesQuantity();
		
		//public Product(String code, double price, String description, String categoria, int quantity)
		Product p1 = new Product("13",1.5,"vino","bevande",2);
		
		//p1.decreasesQuantity();
		
		ProductList listaprodotti = new ProductList();
		
		listaprodotti.addProduct(p1);
		listaprodotti.addProduct(p);
		
				
		
		System.out.println(listaprodotti.searchByCategory("alimentari"));
		
		System.out.println(listaprodotti.searchByPrice(0, 5));
		
		System.out.println(listaprodotti.searchByPrice(7, 15));
		
		
		
		
		
			
		
	}

}
