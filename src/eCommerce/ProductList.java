package eCommerce;

import java.util.ArrayList;
import java.util.LinkedList;
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

	// get and set
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
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


	// metodo di ricerca per categoria 

	public List<Product> searchByCategory(String category) {
		List<Product> temp = new ArrayList<Product>();
		for (Product p: productList) {
			if(p.getcategory().equals(category)) {
				temp.add(p);
			}
		}return temp;
	}

	// metodo di ricerca per prezzo
	public List<Product> searchByPrice(double min, double max) {
		List<Product> temp = new ArrayList<Product>();
		for (Product p: productList) {
			if(p.getPrice() <= max && p.getPrice() >= min){
				temp.add(p);
			}
		}return temp;
	}

	// Metodo per ordinare in modo ascendente il prezzo
	
	public List<Product> orderPrice(double price){
		
		
		
	}










}
