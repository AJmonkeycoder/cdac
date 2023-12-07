package utils;

import com.app.core.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import java.util.List;




import custom_exceptions.*;

public class CustomerValidation {
	
	public static void checkfordup(String email, List<Customer> customer)throws CustomerException{
		Customer newCustomer = new Customer(email);
		if(customer.contains(newCustomer)) {
			throw new CustomerException("email already exist ...");
		}
	}
	public static boolean validateEmail(String email, List<Customer> customerList) throws CustomerException {
		
		
		
		Customer c = new Customer(email);
		int index = customerList.indexOf(c);
		if (index == -1) // => not found !
			throw new CustomerException("Invalid email !!!!");
		                                                            
		return true;
		
		
	}
	
	public static Customer validateCustomer(String email, List<Customer> customerList) throws CustomerException {
		
		Customer c = new Customer(email);
		int index = customerList.indexOf(c);
		if (index == -1) // => not found !
			throw new CustomerException("Invalid password !!!!");
		                                                            
		return customerList.get(index);
		
		
	}
	
	public static ServicePlan parseAndValidatePlan(String servicePlan) throws IllegalArgumentException {
		return ServicePlan.valueOf(servicePlan.toUpperCase());// method throws : IllegalArgumentException , in case of plan out of range
	}
	
	// All input validation method
	public static Customer validateAllInputs(String first_name, String last_name, String email, String password, double registrationAmount, String dob, String plan, List<Customer> customer ) throws CustomerException, IllegalArgumentException, DateTimeParseException{
		checkfordup(email, customer);
		LocalDate dobDate = LocalDate.parse(dob);
		ServicePlan servicePlan = parseAndValidatePlan(plan);
		return new Customer(first_name, last_name, email, password, registrationAmount, dobDate, servicePlan);
	}
}
