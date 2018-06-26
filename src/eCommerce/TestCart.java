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
		
		System.out.println("elenco generale 1");
		pl.showAll();
		
		Cart cart= new Cart();
		Account account=new Account(18.0);
		User u = new User("toni", "pag", "tp", "pass",account);
		u.addCart(cart);
		u.setProductList(pl);
		
		cart.addUser(u);
		cart.addProduct(p);
		cart.addProduct(p2);
		cart.addProduct(p3);
		
		

		System.out.println("Totale prezzo ="+cart.getTotalAmount());
		System.out.println("elenco generale 2");

		pl.showAll();
		
		
		
		cart.removeAll();
		
		
		
		System.out.println("elenco generale 3 ");
		pl.showAll();
		System.out.println("Carrello utente "+u.getCart().getProductList());

	}
}
