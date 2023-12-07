package app;
import com.app.fruits.*;
import java.util.*;
public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of basket ");
		Fruit[] basket = new Fruit[input.nextInt()];
		int choice;
		
		do {
		
		System.out.print("1-> Add Mango \n"
				+ "2-> Add Orange \n"
				+ "3-> Add Apple \n"
				+ "4-> Display all fruits \n"
				+ "5-> Display name,color,weight , taste of all fresh fruits , in the basket. \n"
				+ "6-> Mark a fruit in a basket , as stale \n"
				+ "7-> Mark all sour fruits stale\n"
				+ "8-> Invoke fruit specific functionality (pulp / juice / jam)\n"
				+ "9-> Exit\n");
		
		System.out.println("Choose ...");
		choice=input.nextInt();

	
	switch(choice) {
	case 1: 
		System.out.println("Enter name, color, weight ");
		if(counter<basket.length) {
		basket[counter++] = new Mango(input.next(), input.next(), input.nextDouble(), true);
		}else {
			System.out.println("Basket is Full");
		}
		break;
		
	case 2: 
		System.out.println("Enter color, weight ");
		if(counter<basket.length) {
		basket[counter++] = new Orange(input.next(), input.next(), input.nextDouble(), true);
		}else {
			System.out.println("Basket is Full");
		}
		break;
		
	case 3: 
		System.out.println("Enter color, weight ");
		if(counter<basket.length) {
		basket[counter++] = new Apple(input.next(), input.next(), input.nextDouble(), true);
		}else {
			System.out.println("Basket is Full");
		}
		break;
		
	
	
	case 4 : 
		int m=0, o=0, a=0;
		for(Fruit f : basket) {
			if(f!=null) {
				if(f.getName()=="mango" && m==0 ) {
					System.out.print(" Mango ");
					m++;
				}
				if(f.getName()=="apple" && a==0 ) {
					System.out.print(" Apple ");
					a++;
				}
				if(f.getName()=="orange" && o==0 ) {
					System.out.print(" Orange ");
					o++;
				}
			}
		}
		break;
		
		
		
	case 5 : 
		for(Fruit f : basket) {
			if(f!=null) {
				
			
				System.out.print(f.getName()+" "+f.getColor()+" "+f.getWeight()+" ");
				if(f.getFresh()==true) {
					System.out.println(f.taste());
					}else {
						System.out.println("Not fresh");
					}
			}
		}
		break;
		
	case 6: 
		System.out.print("Enter index : ");
		int ind =  input.nextInt();
		if(ind>=0 && ind<=counter ) {
			basket[ind].setFresh(false);
		}
		else {
			System.out.println("Fruit is not present at index "+ ind);
		}
		break;
		
	case 7:     
		for(Fruit f : basket) {
			if(f!=null) {
				 if(f.getName() == "orange") {
					 f.setFresh(false);
				 }
			}
		}
		break;
		
	case 8 : 
		for(Fruit f : basket) {	
		
		 if(f!=null) {	
			 if(f instanceof Mango)
					System.out.println(((Mango)f).juice());	
			 else if(f instanceof Orange) System.out.println(((Orange)f).pulp());
			 else if(f instanceof Apple) System.out.println(((Apple)f).jam());
			
			
		 }
	
		}	
		
	case 9 :
		System.out.println("     Thank You!    ");
		break;	
		
	default : System.out.println("Wrong choice, pls choose correct option");
		}
	}while(choice!=9);
		

		input.close();
	}
}
