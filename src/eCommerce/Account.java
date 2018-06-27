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
		if(value >=0 && value<=balance ) {
			this.balance=balance-value;
		}else {
			throw new AccountOperationException();
		}
	}


	public void withdrawWithCheck (Check check,double value)throws AccountOperationException {
		//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");
		Date dateDay = new Date();
		if (check.getDate().equals(dateDay)|| dateDay.after(check.getDate())) {
			if(check.getImporto()==value) {
				this.withdraw(value);
			}
			else System.out.println("Importo assegno non corrispondente");	
		}
		else {
			System.out.println("Non è ancora possibile incassare l'assegno. Torna domani...");
		}
	}


}
