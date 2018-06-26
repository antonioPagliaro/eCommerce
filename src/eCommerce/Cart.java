package eCommerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {

	private List<Product> productList;
	private User user;

	public Cart () {
		productList=new ArrayList<Product>();
	}

	public void addUser(User user) {
		this.user=user;
	}
	public User getUser() {
		return user;
	}

	


	public void addProduct( Product product) {
		productList.add(product);
		user.getProductList().removeProduct(product);

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

	//reset productList status
	public void removeAll() {
		//usare iterator
		Iterator<Product> iterator = productList.iterator();
		while (iterator.hasNext()) {
			Product p=	iterator.next();
			user.getProductList().getProductList().add(p);
			iterator.remove();
		}

	}

	

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}



}
