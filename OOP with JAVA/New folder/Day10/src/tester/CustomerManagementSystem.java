package tester;

import java.time.LocalDate;
import java.util.*;

import com.app.core.*;

import custom_exceptions.CustomerException;

import utils.CustomerValidation;
import static utils.CustomerValidation.validateEmail;
import static utils.CustomerValidation.validateAllInputs;
import static utils.CustomerValidation.validateCustomer;
import static java.time.LocalDate.parse;
import ordering.CustomSorting;


public class CustomerManagementSystem {
	public static void main(String[] args) throws CustomerException{
		try(Scanner input = new Scanner(System.in)){
			
			List<Customer> customerList = new ArrayList<>();
			
			customerList.add(new Customer("raj", "singh", "raj@gmail.com", "123", 2400, LocalDate.of(1998, 12, 02), ServicePlan.DIAMOND));
			customerList.add(new Customer("abhay", "gupta", "abhay@gmail.com", "456", 2200, parse("2001-10-03"), ServicePlan.SILVER));
			customerList.add(new Customer("amal", "sray", "sray@gmail.com", "5tred", 2100, parse("2001-06-17"), ServicePlan.SILVER));
			customerList.add(new Customer("aditya", "maurya", "adi@gmail.com",  "ytr", 3400, parse("1997-04-09"), ServicePlan.GOLD));
			Customer customer5 = new Customer("keshav", "soni", "soni@gmail.com", "iu765", 3100, LocalDate.of(2001, 04, 12), ServicePlan.SILVER);
			Customer customer6 = new Customer("sneha", "sharma", "sneha@gmail.com", "678iut", 4400, parse("2000-12-12"), ServicePlan.SILVER);
			
			customerList.add(customer5);
			customerList.add(customer6);
			
			boolean exit = false;
			while(!exit) {
			System.out.println("1-> Sign up \n"
					+ "2-> Sign in \n"
					+ "3-> Change Password \n"
					+ "4-> Un subscribe customer \n"
					+ "5-> Display all customers \n"
					+ "6-> Sort the customer\n"
					+ "7-> Sort the customer on basis of name and dob\n"
					+ "0-> exit ");
			
			try {
			switch(input.nextInt()) {
			case 1 :
				System.out.println("Enter first name, last name, email, password, registration amount, date of birth, plan(silver, gold, diamond, platinum");
				 
				Customer newCustomer = validateAllInputs(input.next(), input.next(), 
						input.next(), input.next(), input.nextDouble(), input.next(), input.next(), customerList);
				customerList.add(newCustomer);
				break;
				
			case 2 :
				System.out.println("Enter email ");
				Customer customer = validateCustomer(input.next(), customerList);
				System.out.println("Enter password ");
				String pass = input.next();
				if(customer.validatePassword(pass)) {
					System.out.println("Sign in successful");
				}else System.out.println("wrong password");
				break;
				
				 // Change password
			case 3: 
				System.out.println("Enter email  ");
				Customer cust = validateCustomer(input.next(), customerList);
				System.out.println("Enter old pasword  ");
				 String oldPass = input.next();
					if(cust.validatePassword(oldPass)) {
						System.out.println("Enter new passsword");
						 cust.setPassword(input.next());
						 System.out.println("Password changed successfully");
					}else System.out.println("wrong password");
					break;
					
					
			//delete customer 
			case 4 :
				System.out.println("Enter email  ");
				Customer unsub = validateCustomer(input.next(), customerList);
				int index = customerList.indexOf(unsub);
				customerList.remove(index);
				break;
				
			case 5 :
				for(Customer c : customerList) {
					System.out.println(c);
				}
				break;
				
			// sorting customer on basis of email (natural ordering);
			case 6 : 
				Collections.sort(customerList);
				
				
			//Sorting customer on basis of dob;	
			case 7 :
				Collections.sort(customerList, new CustomSorting());
				
				System.out.println("Sorted list as per dob and name");
				for (Customer v : customerList)
					System.out.println(v);
				break;
					
				
			case 0 :System.out.println("Exiting....");
		default : System.out.println("Wrong option pls enter currect option");
			
			}
			}
			catch(Exception e) {
				e.printStackTrace();
				input.nextLine();
			}
		}
	}
		
		

}
}
