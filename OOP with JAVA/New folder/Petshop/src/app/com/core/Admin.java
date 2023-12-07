package app.com.core;

public class Admin {
	private String admin;
	private String password;
	
	
	public Admin(String admin, String password) {
		super();
		this.admin = admin;
		this.password = password;
	}


	public String getAdmin() {
		return admin;
	}


	public void setAdmin(String admin) {
		this.admin = admin;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
