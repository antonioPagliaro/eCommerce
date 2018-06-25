package eCommerce;

public class TestCart {
	public static void main(String[] args) {
		Product p = new Product("1", 1.0, "prodotto 1",1);
		Product p2 = new Product("2", 2.5, "prodotto 2",1);
		Product p3 = new Product("3", 3.0, "prodotto 3",2);
		
		ProductList pl= new ProductList();
		pl.addProduct(p);
		pl.addProduct(p2);
		pl.addProduct(p3);
		
		Cart cart= new Cart();
		User u = new User("toni", "pag", "tp", "pass");
		u.addCart(cart);
		cart.addUser(u);
		cart.addProduct(p);
		cart.addProduct(p2);
		cart.addProduct(p3);

		System.out.println("Totale prezzo ="+cart.getTotalAmount());
		
		

	}
}