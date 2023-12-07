
import java.util.*;
public class Tester {

	private static Stack selectedStack;

	public static void main(String[] args) {
		System.out.println("");
		Scanner sc = new Scanner(System.in);		
		boolean exit=false;
		while(!exit){
			
			System.out.println("1-> Choose Fixed stack\n"
					+ "2-> Choose Growable Stack\n"
					+ "3-> Push data\n"
					+ "4-> pop data and display\n"
					+ "5-> exit \n");
			
			switch(sc.nextInt()){
				case 1 : selectedStack = new FixedStack();
				break;
				
				case 2 : selectedStack = new GrowableStack();
				break;
				
				case 3 : 
					if(selectedStack == null) System.out.println("No stack selected ");
					else {
						System.out.println("Enter id name and adress");
						Customer newCustomer = new Customer(sc.nextInt(), sc.next(), sc.next());
						
						selectedStack.push(newCustomer);
					}
					break ;
					
				case 4 : 
					if(selectedStack == null) System.out.println("No stack selected ");
					else {
						Customer customerDetail = selectedStack.pop();
						System.out.println(customerDetail);
					}
					break;
				case 5 :
					exit =true;
					
					default : System.out.println("Wrong choice");
			}
		}

	}

}
