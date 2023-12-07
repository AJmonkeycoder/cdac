
public class Customer {
	
	int id;
	String name;
	String address;
	
	public Customer (int id, String nm, String add) {
		this.id = id;
		name=nm;
		address = add;
		
		
	}
	
	public String toString() {
		return "Customer id : "+ id + " name : " + name + " address : " +address;
	}

	

}
