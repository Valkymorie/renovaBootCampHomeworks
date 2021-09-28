package com.valkymorie.Model;

public class Company extends Customer{
	
	private String contact;
	private int discount;
	
	public Company(String address, int id, String name, String phone, String contact, int discount) {
		super(address, id, name, phone);
		this.contact = contact;
		this.discount = discount;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getDiscount() {
		return discount;
	}
	
	
	

}
