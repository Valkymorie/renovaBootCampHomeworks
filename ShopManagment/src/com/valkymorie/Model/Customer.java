package com.valkymorie.Model;

public abstract class Customer {
	
	private String address;
	private int id;
	private String name;
	private String phone;
	
	public Customer () {
		
	}
	
	public Customer(String address, int id, String name, String phone) {
		this.address = address;
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}


}
