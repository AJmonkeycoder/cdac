package utils;

import java.util.List;

import app.com.core.Pet;
import customException.UnauthorizedException;

public class PetValidation {
	public static Pet validateId(int id, List<Pet> list) throws UnauthorizedException {
		Pet p = new Pet(id);
		int index = list.indexOf(p);
		if(index ==-1) {
			throw new UnauthorizedException("Invalid id");
		}
		return list.get(index);
		
	}
}
