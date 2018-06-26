package eCommerce;

public class TestEffettua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Product p1=new Product("345", 50.0, "scarpe",2);
      Product p2=new Product("346", 45.0, "scarpe",2);
		Cart cart=new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.getTotalAmount();
    	System.out.println(cart.getTotalAmount());
        
		Purchase purchase=new Purchase(cart);
		Account account=new Account(345.45);
		User user =new User("fabio", "surname", "f.01", "345", account);
		user.addCart(cart);
		cart.addUser(user);
		
		try {
			
			purchase.makePurchase();
			System.out.println("pagamento effettuato");
			
		} catch( AccountOperationException e) {
			System.out.println("IMPOSSIBILE EFFETTUARE PAGAMENTO");
		}
		
		
		
		
	
		
	}

}

