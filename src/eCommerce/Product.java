package eCommerce;

public class Product {
	
	//Attributi della classe
	
	private String code;
	private String price;
	private String description;
	private int quantity;
	
	
	// Costruttori 
	
	public Product(String code, String price, String description, int quantity) {
		super();
		this.code = code;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}


	// Metodi Get and Set
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [code=" + code + ", price=" + price + ", description=" + description + ", quantity=" + quantity
				+ "]";
	}
	
	
	
	
	
	
	

}
