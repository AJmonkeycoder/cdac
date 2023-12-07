package app.com.core;

import java.time.LocalDate;



public class Pen {

	private int id;
	private String brand;
	private String color;
	private String inkColor;
	private String material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private int price;
	private int discount;
	
	private static int idGenerator=1;
	
	//constructor
	public Pen(String brand, String color, String inkColor, String material, int stock, 
			int price, int discount) {
		super();
		id=idGenerator++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		stockUpdateDate = LocalDate.now();
		stockListingDate=LocalDate.now();
		this.price = price;
		this.discount = discount;
	}
	
	public Pen(int id) {
		super();
		this.id = id;
	}
	
public boolean equals(Object o) {
		
		if(o instanceof Pen) {
			Pen validateCustomer = (Pen) o;
			return this.id==(validateCustomer.id);
		}
		
		return false;
	}
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id += id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock += stock;
		stockUpdateDate = LocalDate.now(); 
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	// return the detail as string
	@Override
	public  String toString() {
		return "Id : "+id+", Brand : "+brand+", Colour : "+color+", InkColour : "+inkColor+", Material : "+material+", Stock update date : "+stockUpdateDate+", Stock listing date : "+stockListingDate+", Price : "+price+", Discount : "+discount;
	}
}
