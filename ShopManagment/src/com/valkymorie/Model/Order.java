package com.valkymorie.Model;

import java.util.Date;
import java.util.List;

public class Order {
	
	private Customer customer;
	private int id;
	private List<OrderItem> items;
	private Date orderDate;
	private double orderTotal;

	
	public Order() {
	}

	public Order(Customer customer, int id, List<OrderItem> items, Date orderDate, double orderTotal) {
		this.customer = customer;
		this.id = id;
		this.items = items;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
	}
	
	public void addOrderItem(OrderItem orderItem) {
		items.add(orderItem);
	}


	public Customer getCustomer() {
		return customer;
	}


	public int getId() {
		return id;
	}


	public List<OrderItem> getItems() {
		return items;
	}


	public Date getOrderDate() {
		return orderDate;
	}

	// ordertotal = orderitem+ orderitem+ ....
}
