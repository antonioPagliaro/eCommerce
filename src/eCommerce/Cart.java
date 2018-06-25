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

<<<<<<< HEAD
=======

>>>>>>> 29b0a64baa00cd11b12281b64ec3a7df42b4fe55
	}


	public void addProduct( Product d) {
		productList.add(d);

<<<<<<< HEAD
	}

	public void removeProduct(Product p) {
		productList.remove(p);

	}


=======
	}

	public void removeProduct(Product p) {
		productList.remove(p);


	}

	public void addPezzo(Product product) {
		for(Product p : productList) {
			if(p.getCode().equals(product.getCode())){
				//p.incrementQuantity();

			}
		}
	}

	public void removePezzo(Product product) {
		for(Product p : productList) {
			if(p.getCode().equals(product.getCode())){
				//p.decrementQuantity();
			}
		}

	}


	public double getTotalAmount() {
		double total=0.0;

		for( Product p : productList) {
			total=total+(p.getPrice()*p.getQuantity());
		}
		return total;
	}
	
	
>>>>>>> 29b0a64baa00cd11b12281b64ec3a7df42b4fe55
}
