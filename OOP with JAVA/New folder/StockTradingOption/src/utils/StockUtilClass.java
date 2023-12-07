package utils;

import java.util.List;

import app.com.core.Stock;
import exception_handling.StockExceptionClass;

public class StockUtilClass {
	public static Stock findByName(String cName, List<Stock> stocks) throws StockExceptionClass {
		for (Stock s1 : stocks) {
			if (s1.getcName().equals(cName)) {
				return s1;
			} else {
				throw new StockExceptionClass("Invalid Company Name!!");
			}
		}
		return null;

	}
	
	public static Stock findById(String id, List<Stock> stocks) throws StockExceptionClass {
		Stock st = new Stock(id);
		
		int index = stocks.indexOf(st);
		if(index == -1) {
			throw new StockExceptionClass(" invalid stock Id!!!");
		}
		return stocks.get(index);

	}
}
