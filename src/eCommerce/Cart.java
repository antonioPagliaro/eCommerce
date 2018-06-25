package eCommerce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cart {

	List<Product> productList;
	User u;

	public Cart () {
		productList=new ArrayList<Product>();
	}

	public void addUser(User u) {
		this.u=u;


	}


	public void addProduct( Product d) {
		productList.add(d);

	}

	public void removeProduct(Product p) {
		productList.remove(p);


	}


}
