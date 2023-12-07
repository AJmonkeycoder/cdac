package tester;

import static validation_rules.StockValidation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

import app.com.core.Stock;
import static utils.StockUtilClass.*;

public class StockTradingService {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (Scanner sc = new Scanner(System.in);
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stock.bin"))) 
				{
			List<Stock> stocks = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Add atleast 5 Stocks");
				System.out.println("2. Add new stock in the market");
				System.out.println("3. View Available stock by company");
				System.out.println("4.purchase stock");
				System.out.println("5.sale stock");
				System.out.println("6.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						for (int i = 0; i < 5; i++) {
							System.out.println("Enter id , stock name, company name, price , listing date, qty ");
							Stock s = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
									sc.nextInt(), stocks);
							stocks.add(s);
						}
						System.out.println("All stock added successfully");
						break;
					case 2:
						Stock s = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.nextInt(), stocks);
						stocks.add(s);
						System.out.println("stock added successfully");
						break;
						

					case 3:
//						System.out.println("Enter company name");
//						String cname = sc.next();
//						boolean noc=false;
//						for(Stock s1 : stocks) {
//							if(s1.getcName().equals(cname)) {
//								System.out.println("Available stock"+s1.getQ());
//								noc=true;
//							}
//							if(noc) System.out.println("No available");
//						}
//						break;

						System.out.println("Enter company name");
						String cname = sc.next();
						Stock stt = findByName(cname, stocks);
						System.out.println("Available qty is : " + stt.getQ());
						break;

					case 4:
						System.out.println("Enter the stock id and required qty");
						String id = sc.next();
						int qty = sc.nextInt();

						stt = findById(id, stocks);
//						checkForAvailableStock(qty, stocks);
						stt.setQ(stt.getQ() + qty);
						break;
					case 5:
						System.out.println("Enter the stock id and selling qty");
						id = sc.next();
						qty = sc.nextInt();

						stt = findById(id, stocks);
						checkForAvailableStock(qty, stocks);
						stt.setQ(stt.getQ() - qty);
						break;
					case 6:
						exit = true;
						System.out.println("Enter the file name");
						out.writeObject(stocks);
						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}

		}

	}

}
