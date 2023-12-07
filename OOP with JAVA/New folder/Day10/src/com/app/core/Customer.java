package com.app.core;
import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;

		private static int id_inc =1;
	
	public Customer( String first_name, String last_name, String email, String password, double registrationAmount, LocalDate dob, ServicePlan plan) {
		super();
		this.id = id_inc++;
		this.first_name = first_name;
		this.last_name =  last_name;
		this.email=email;
		this.password=password;
		this.registrationAmount =registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	public Customer(String email) {
		super();
		this.email = email;
	}
	@Override
	public  int compareTo(Customer c) {
		return this.email.compareTo(c.email);
	}
	
	
	
	
	public boolean equals(Object o) {
		
		if(o instanceof Customer) {
			Customer validateCustomer = (Customer) o;
			return this.email.equals(validateCustomer.email);
		}
		
		return false;
	}
	
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String toString() {
		return " id : "+id+", First Name : "+first_name+", Last Name "+last_name+", email : "+email+", Dob : "+dob+", Plan : "+plan;
	}
	
	// getter and setter
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean validatePassword(String password) {
		return this.password.equals(password);
	}

	


	
	


}