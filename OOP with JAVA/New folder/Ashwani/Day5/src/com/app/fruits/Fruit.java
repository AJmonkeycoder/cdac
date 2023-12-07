package com.app.fruits;

 public class Fruit {
		private String name;
	private String color;
	private double weight;

	private boolean fresh;
	
	public Fruit(String nm, String clr, double w , boolean f){
		name = nm;
		color = clr;
		weight = w;
		
		fresh = f;
	}
	public String taste() {
		return "No specific taste";
	}
	
	public String toString() {
		return "Name : "+name+" Color : "+color+" Weight : "+weight;
	}
	
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public boolean getFresh() {
		return fresh;
	}
	public void setFresh(boolean f) {
		fresh = f;
	}


}
