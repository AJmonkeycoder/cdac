package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import app.com.core.Category;
import app.com.core.Pet;
import customException.UnauthorizedException;

public class Validation {
	
	public static String check(String id, String pass) throws UnauthorizedException {
		if(id=="admin" && pass=="admin") {
			return "admin";
		}
		else if(id=="c1" && pass=="c1") {
			return "customer";
		}
		throw new UnauthorizedException("Invalid id and password");
	}
	public static Category parseAndValidateCategory(String category) throws IllegalArgumentException {
		return Category.valueOf(category.toUpperCase());
	}
	
	public static void DuplicateId(int id, List<Pet> list) throws UnauthorizedException {
		Pet p = new Pet(id);
		if(list.contains(p)) {
			throw new UnauthorizedException("Duplicate Id");
		}
	}
	
	public static Pet validateAllInputs(int id, String name, String category, int price, int stocks, List<Pet> list) throws UnauthorizedException {
		DuplicateId(id, list);
		Category c = parseAndValidateCategory(category);
		return new Pet(id, name, c, price, stocks);
	}

	
	
	
}
