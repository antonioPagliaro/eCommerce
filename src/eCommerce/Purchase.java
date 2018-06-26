package eCommerce;

public class Purchase {
	
	

	Cart cart;
	
	
	public Purchase(Cart cart) {
		
		this.cart=cart;
	}
	
	
	public void makePurchaseWithCreditCard() throws AccountOperationException  {
		 makePaymentWithCreditCard();
		 cart.cleanCart();
		
	}
	
	public void makePurchaseWithCheck(Check check) throws AccountOperationException  {
		 makePaymentWithCheck(check);
		 cart.cleanCart();
		
	}
	
	
	private void makePaymentWithCheck(Check check) throws AccountOperationException {
		cart.getUser().getAccount().withdrawWithCheck(check);
		
	}


	private void makePaymentWithCreditCard() throws AccountOperationException {
		cart.getUser().getAccount().withdraw(cart.getTotalAmount());
	}
	
	public void abort() {
		cart.removeAll();
		
	}
	
}
