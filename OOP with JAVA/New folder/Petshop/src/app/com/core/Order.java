package app.com.core;

public class Order {
	private int Orderid;
	private int petId;
	private int quantity;
	private Status status;
	
	private int idGenerator=1;

	public Order(int petId, int quantity, Status status) {
		super();
		Orderid =idGenerator++;
		this.petId = petId;
		this.quantity = quantity;
		this.status = status;
		
	}
	
}
