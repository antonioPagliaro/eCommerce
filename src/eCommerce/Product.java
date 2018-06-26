package eCommerce;

public class Product {

	//Attributi della classe

	private String code;
	private double price;
	private String description;
	private int quantity;


	// Costruttori 

	public Product(String code, double price, String description, int quantity) {
		super();
		this.code = code;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}

	public Product(String code, double price, String description) {
		super();
		this.code = code;
		this.price = price;
		this.description = description;
		this.quantity = 1;
	}


	// Metodi Get and Set

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
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


	// metodo per aumentare la quantità

	public void increaseQuantity() {
		quantity++;

	}

	// metodo per diminuire la quantità

	public void decreasesQuantity() throws DecreaseQuantityException{

		if (quantity <= 0) {

			throw new DecreaseQuantityException();

		}else {

			quantity--;
			
		}

	}



}
