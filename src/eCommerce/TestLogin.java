package eCommerce;

import java.util.Scanner;

public class TestLogin {
	public static void main(String[] args) throws LoginException {
		Login login=new Login();
		Scanner s=new Scanner(System.in);
		System.out.println("Inserisci username");
		String username=s.nextLine();
		System.out.println("Inserisci password");
		String password=s.nextLine();
		login.login(username, password);
	}

}
