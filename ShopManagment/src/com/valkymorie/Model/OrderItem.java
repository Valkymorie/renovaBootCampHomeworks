package com.valkymorie.Model;

public class OrderItem {

	private int lineNumber;
	private Product product;
	private int quantity;
	
	public OrderItem(int lineNumber, Product product, int quantity) {
		
		this.lineNumber = lineNumber;
		this.product = product;
		this.quantity = quantity;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	 // getItemTotal getTax getUnitPrice
	
	public double getUnitPrice() {
		return product.getRetailPrice();
	}
	
	public double getTax() {
		if(product instanceof Hardware) {
			return ((Hardware) product).getTax(getUnitPrice());
		}
		else {
			return 0;
		}
	}
	
	public double getItemTotal() {
		return (getUnitPrice()+getTax()) * quantity;
	}
	
}
