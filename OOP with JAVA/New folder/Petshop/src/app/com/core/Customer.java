package app.com.core;

public class Customer {
	private String custId;
	private String password;
	
	
	public Customer(String custId, String password) {
		super();
		this.custId = custId;
		this.password = password;
	}


	public String getCustId() {
		return custId;
	}


	public void setCustId(String custId) {
		this.custId = custId;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
