package eCommerce;

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
	
	
	public void withdrawWithCheck (Check check,Date dateDay)throws AccountOperationException {
		if (check.getDate().equals(dateDay)|| dateDay.after(check.getDate())) {
			this.withdraw(check.getImporto());
			}
			else {
				System.out.println("errore");
			}
		}
		            
		
	}
