package eCommerce;

public class PaymentWithCheck implements Payment{

	Check check;
	public  PaymentWithCheck(Check check) {
	this.check=check;
		}
	
	@Override
	public void makePayment(Account a,double value) {
		try {
			a.withdrawWithCheck(check,value);
		} catch (AccountOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
