package com.valkymorie.Model;

public class Individual extends Customer{
	
	private String licenseNumber;

	public Individual(String address, int id, String name, String phone, String licenseNumber) {
		super(address,id,name,phone);
		this.licenseNumber = licenseNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "License Number: " + licenseNumber + "\n"
				+ "Address: "+ getAddress() + "\n"
				+ "ID: "+ getId() + "\n"
				+ "Name: " + getName() + "\n"
				+ " Phone: "+ getPhone();
	}	

}
