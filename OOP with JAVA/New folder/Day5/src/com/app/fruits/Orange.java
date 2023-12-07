package com.app.fruits;

public class Orange extends Fruit {
	public Orange( String nm, String clr, double w,boolean f) {
		super(nm,clr,w,f);
		
	}
	
	public String pulp() {
		return getName()+ " "+ getColor()+" Extracting Juice!!! ";
	}
	
	public String taste() {
		return " sour";
	}
}
