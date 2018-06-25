package eCommerce;

public class Purchase {
	
	

	Cart cart;
	
	
	public Purchase(Cart cart) {
		
		this.cart=cart;
	}
	
	
	public void effettua(User user) {
		 cart.u.getAccount().withdraw(cart.getTotalAmount());
		
	}
	
	public void abort() {
//		cart.removeAll();
		
	}
	
}
