package eCommerce;

import java.util.HashMap;
import java.util.Map;

public class Login {
	
	private Map<String,String> users;
	
	public Login() {
		initData();
	}
	
	private void initData() {
		users=new HashMap<String,String>();
		users.put("toni", "toni88");
		users.put("fabio", "fabio95");
		users.put("firno", "firno87");
		users.put("domenico", "guida89");
	}

	public boolean login(String username,String password) throws LoginException {
		
		if (users.get(username)==null)throw new LoginException();
		if(users.get(username).equals(password)) {
			System.out.println("Login complete");
			return true;
		}
		else 
			throw new LoginException();
	}
}
