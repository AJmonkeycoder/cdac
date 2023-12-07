package Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static utils.Validation.*;
import static utils.PetValidation.*;

import java.util.Scanner;

import app.com.core.Category;
import app.com.core.Customer;
import app.com.core.Pet;
import customException.UnauthorizedException;

public class PetStore {
public static String isAdmin;
	public static void main(String[] args) throws UnauthorizedException {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in)){
			boolean exit=false;
			String s =null;
			
			List<Pet> petList = new ArrayList<>();
			
			
			
			
			while(!exit) {
				System.out.println("1-> Login\n"
						+ "2-> Add new pet\n"
						+ "3-> Update pet Details\n"
						+ "4-> Display all available pets\n"
						+ "5-> Order a Pet\n"
						+ "6-> Check order status\n"
						+ "7-> update order status\n"
						+ "8-> Exit");
				
				switch(sc.nextInt()) {
				//Log in
				case 1 :
					System.out.println("Enter Id and Password");
					 s=check(sc.next(), sc.next());
					break ;
				//Add new Pet	
				case 2 :
					if(s == "admin") {
						System.out.println("Enter petId, name, category, unitPrice, stocks");
						Pet newPet = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), petList);
						petList.add(newPet);
						System.out.println("Added succeesfully");
					}
					else {
						throw new UnauthorizedException("unauthorized");
					}
					break;
					//Update pet details
				case 3 :
					if(s == "admin") {
						System.out.println("Enter pet id");
						Pet oldPet = validateId(sc.nextInt(), petList);
					}
						else {
							throw new UnauthorizedException("Unauthorized");
						}
						break;
						//Display all available pets;
				case 4 :
						for(Pet p : petList) {
							System.out.println(p);
						}
						break;
					//order a pet	
				case 5 :
					System.out.println("Enter Pet Id");
					Pet orderPet = validateId(sc.nextInt(), petList);
					
					
							
				}
						
			}
		}

	}

}
