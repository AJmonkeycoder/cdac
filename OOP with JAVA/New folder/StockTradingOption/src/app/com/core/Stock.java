package app.com.core;

import java.time.LocalDate;

public class Stock {
	private String id;
	private String sName;
	private String cName;
	private double price;
	private LocalDate cDate;
	private int q;

	public Stock(String id, String sName, String cName, double price, LocalDate cDate, int q) {
		super();
		this.id = id;
		this.sName = sName;
		this.cName = cName;
		this.price = price;
		this.cDate = cDate;
		this.q = q;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Stock(String id) {
		super();
		this.id = id;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", sName=" + sName + ", cName=" + cName + ", price=" + price + ", cDate=" + cDate
				+ ", q=" + q + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Stock) {
			Stock newStock = (Stock) obj;
			return this.id.equals(newStock.id);
		}
		return false;
	}

}
