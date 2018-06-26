package eCommerce;

public class Purchase {
	
	

	Cart cart;
	
	
	public Purchase(Cart cart) {
		
		this.cart=cart;
	}
	
	
	public void makePurchase() throws AccountOperationException  {
		 makePayment();
		 cart.cleanCart();
		
	}
	
	private void makePayment() throws AccountOperationException {
		cart.getUser().getAccount().withdraw(cart.getTotalAmount());
	}
	
	public void abort() {
		cart.removeAll();
		
	}
	
}
