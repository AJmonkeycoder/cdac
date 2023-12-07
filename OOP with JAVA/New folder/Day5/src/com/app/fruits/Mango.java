package com.app.fruits;

public class Mango extends Fruit {

		public Mango(String nm,String clr, double w,  boolean f) {
			super(nm,clr,w,f);
			
		}
		
		public  String juice() {
			return getName()+ " "+ getColor()+" Creating Pulp!!! ";
		}
		
		public String taste() {
			return " sweet";
		}
		
	

}
