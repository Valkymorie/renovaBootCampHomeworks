package com.valkymorie.Model;

public abstract class Product {

	private String description;
	private int id;
	private String name;
	private double retailPrice;
	
	public Product(String description, int id, String name, double retailPrice) {
		this.description = description;
		this.id =id;
		this.name = name;
		this.retailPrice = retailPrice;		
	}

	public String getDescription() {
		return description;
	}
	
	public double getRetailPrice() {
		return retailPrice;
	}
	
}
