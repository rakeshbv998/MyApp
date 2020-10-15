package com.ofss;

public class Customer {
	String customerName;
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		
	}
	
	@Override
	public String toString() {
		String msg=this.customerName+" ";
		return msg;
	}
	

}

