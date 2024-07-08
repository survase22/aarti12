package com.tnsif.daythree.constructor;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	//Default constructor 
	public Customer() {
		System.out.println("Default constructor");
	}

	
	
	//Parametriozed constructor 
	//use of this keyword 
	public Customer(String customerName, int customerId, String customerCity) {
		this(); //calling default constructor 
		
		System.out.println("Parameterized Constructor ");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}



	//getter and setter
	public String getCustomerName() {
		return customerName;
	}

}
