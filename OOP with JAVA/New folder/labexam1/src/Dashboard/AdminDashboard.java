package Dashboard;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import app.com.core.Pen;
import customException.PenException;

import static utils.PenValidation.validatePen;

public class AdminDashboard {

	public static void main(String[] args) throws PenException {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in)){
			List<Pen> penBox = new ArrayList();
			penBox.add(new Pen("cello", "grey", "blue", "plastic", 50, 8, 1));
			penBox.add(new Pen("cello", "grey", "black", "plastic", 34, 8, 1));
			penBox.add(new Pen("Pentonic", "grey", "blue", "plastic", 60, 10, 1));
			penBox.add(new Pen("Pentonic", "green and black", "black", "plastic", 20, 8, 1));
			boolean exit = false;
			for(Pen p : penBox) {
				System.out.println(p);
			}
			
			while(!exit) {
				System.out.println("1-> Add Pen\n"
						+ "2-> Update Stock\n"
						+ "3-> Set discount\n"
						+ "4-> remove unsold pen\n"
						+ "5-> exit");
				
				switch(sc.nextInt()) {
				case 1 :
					System.out.println("Enter brand, color, inkcolor, material, stock, price, discount");
					Pen newPen = new Pen(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					penBox.add(newPen);
					System.out.println("Pen added successfully");
					break;
					
				case 2 :
					System.out.println("Enter id of pen");
					Pen penStock = validatePen(sc.nextInt(), penBox);
					System.out.println("Current stock "+penStock.getStock());
					System.out.println("Enetr new stock");
					penStock.setStock(sc.nextInt());
					System.out.println("Updated Stock : "+penStock.getStock());
					break;
					
					//Set Discount of 20% for all the pens which are no sold in 3 months
				case 3 : 
					int count=0;
					for(Pen p : penBox) {
						if(p.getStockUpdateDate().isBefore(LocalDate.now().minusMonths(3))) {
							p.setDiscount(20);
							count++;
						}
					}
					System.out.println("Discount applied for "+count+" pens");
					break;
					
					//Remove pens which are not sold in once in last 9 months;
					
				case 4 :
					Iterator<Pen> itr = penBox.listIterator();
					while(itr.hasNext()){
						Pen val = itr.next();
						if(val.getStockUpdateDate().isBefore(LocalDate.now().minusMonths(9))) {
							itr.remove();
						}
					
						}
					break;
					
				case 5 : 
					exit=true;
					break;
					
					default : 
						System.out.println("Wrong option");
					
				}
			}
		}

	}

}
