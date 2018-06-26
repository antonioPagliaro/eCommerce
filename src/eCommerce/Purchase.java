package eCommerce;

public class Purchase {
	
	

	Cart cart;
	
	
	public Purchase(Cart cart) {
		
		this.cart=cart;
	}
	
	
	public void makePayment() throws AccountOperationException {
		 cart.getUser().getAccount().withdraw(cart.getTotalAmount());
		 cart.cleanCart();
		
	}
	
	public void abort() {
		cart.removeAll();
		
	}
	
}
