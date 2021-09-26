package com.valkymorie.Model;

import com.valkymorie.Behavior.Taxable;

public class Hardware extends Product implements Taxable{

	private int warrantyPeriod;

	public Hardware(String description, int id, String name, double retailPrice, int warrantyPeriod) {
		super(description, id, name, retailPrice);
		this.warrantyPeriod = warrantyPeriod;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	
	@Override
	public double getTax(double retailPrice) {
		// TODO Auto-generated method stub
		return retailPrice += retailPrice*0.2;
	}

	
}
