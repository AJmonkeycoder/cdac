package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String nm, String clr, double w,  boolean f) {
		super(nm, clr,w,f);
		
	}
	
	public String jam() {
		return getName()+ " "+ getColor()+" Making Jam!!! ";
	}
	
	

	public String taste() {
		return " sweet and sour";
	}
	
}
