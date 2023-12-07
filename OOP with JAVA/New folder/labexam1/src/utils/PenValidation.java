package utils;

import java.util.List;

import app.com.core.Pen;
import customException.PenException;

public class PenValidation {
	public static Pen validatePen(int id, List<Pen> pen)throws PenException {
		Pen p = new Pen(id);
		int ind = pen.indexOf(p);
		//System.out.println(p);
		if(ind == -1) {
			throw new PenException("Invalid id");
		}
		return pen.get(ind);
		
		
	}
}
