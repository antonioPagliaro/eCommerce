package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import eCommerce.Account;
import eCommerce.AccountOperationException;
import eCommerce.Check;
import eCommerce.PaymentWithCheckException;

public class TestPaymentWithCheck {

	public static void main(String[] args) throws AccountOperationException, PaymentWithCheckException {
		// TODO Auto-generated method stub
		
		 @SuppressWarnings("deprecation")
		Date date=new Date("2018/6/25");
		 Check check=new Check( date ,200.45);
     	Account account=new Account(340.5);
   	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    	Date date2 = new Date();
    	System.out.println("Data dell'assegno "+dateFormat.format(date)); 
    	System.out.println("Data di oggi "+dateFormat.format(date2)); 
    	
	  try {
    	account.withdrawWithCheck(check);
	  } catch(AccountOperationException e) {
		  System.out.println("impossibile pagare");
	  }
		
		
		
	}

}
