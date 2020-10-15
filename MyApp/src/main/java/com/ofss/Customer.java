package com.ofss;

public class Customer {
	String customerName;
	String location;
	public Customer(String customerName, String location) {
		super();
		this.customerName = customerName;
		this.location = location;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", location=" + location + "]";
	}
	
	
	
	
	
	

}

