package eCommerce;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	private double balance;
   
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double value) throws AccountOperationException {
		if(value>0) {
			this.balance=balance+value;
		}
		else {
			throw new AccountOperationException();
		}
	}
	
	
	public void withdraw(double value) throws AccountOperationException {
		if(value >0 && value<balance ) {
			this.balance=balance-value;
		}else {
			throw new AccountOperationException();
		}
	}
	
	
	public void withdrawWithCheck (Check check)throws AccountOperationException, PaymentWithCheckException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    	Date dateDay = new Date();
		if (check.getDate().equals(dateDay)|| dateDay.after(check.getDate())) {
			this.withdraw(check.getImporto());
			System.out.println("Payment with check complete");
			}
			else {
				throw new PaymentWithCheckException();
			}
		}
		            
		
	}
	
	
	
	
	
	
	


