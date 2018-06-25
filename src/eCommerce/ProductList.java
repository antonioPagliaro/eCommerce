package eCommerce;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	
	// Attributi
	private List<Product> productList;
	
	// Costruttore
	public ProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	public ProductList() {
		this.productList = new ArrayList<Product>();
	}
	
	// Aggiungi prodotto
	public void addProduct(Product p) {
		productList.add(p);
	}
	
	// Rimuovi prodotto
	public void removeProduct(Product p) {
		productList.remove(p);
	}
	
	
	public void showAll() {
		for(Product p : productList) {
			System.out.println(p);
		}
	}
	
	
	
	
	
	

}
