package validation_rules;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import app.com.core.Stock;
import exception_handling.StockExceptionClass;

public class StockValidation {
	public static void checkforDuplicateId(String id, List<Stock> stocks) throws StockExceptionClass {
		Stock st = new Stock(id);
		if (stocks.contains(st))
			throw new StockExceptionClass("Duplicate Stock Details");

	}

	public static LocalDate parseAndValidateDate(String date) throws DateTimeParseException {
		LocalDate dt = LocalDate.parse(date);
		return dt;
	}

	public static void checkForAvailableStock(int qty, List<Stock> lists) throws StockExceptionClass {
		for (Stock s : lists) {
			if (s.getQ() < qty)
				throw new StockExceptionClass(" qty is not available!!");
		}
	}

	public static Stock validateAllInputs(String id, String sName, String cName, double price, String cDate, int q,
			List<Stock> stocks) throws StockExceptionClass, DateTimeParseException {
		checkforDuplicateId(id, stocks);
		LocalDate dt = parseAndValidateDate(cDate);
		

		return new Stock(id, sName, cName, price, dt, q);
	}
}
