package app.com.core;

public class Pet {
	
	private int petId;
	private String name;
	private Category category;
	private int unitPrice;
	private int stocks;
	
	public Pet(int petId, String name, Category category, int unitPrice, int stocks) {
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}

	public Pet(int id) {
		// TODO Auto-generated constructor stub
		this.petId=id;
	}
	
	
}
