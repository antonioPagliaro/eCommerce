package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import eCommerce.Account;
import eCommerce.AccountOperationException;
import eCommerce.Check;

public class TestPaymentWithCheck {

	public static void main(String[] args) throws AccountOperationException {
		// TODO Auto-generated method stub
		
		 @SuppressWarnings("deprecation")
		Date date=new Date("2018/6/26");
		 Check check=new Check( date ,400.45);
     	Account account=new Account(340.5);
   	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    	Date date2 = new Date();
    	System.out.println(dateFormat.format(date)); 
    	System.out.println(dateFormat.format(date2)); 
	  try {
    	account.withdrawWithCheck(check, date2);
	  } catch(AccountOperationException e) {
		  System.out.println("impossibile pagare");
	  }
		
		
		
	}

}
