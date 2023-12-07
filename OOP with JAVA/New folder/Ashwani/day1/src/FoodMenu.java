import java.util.Scanner;

class FoodMenu{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int choice;
		int bill=0;
		int q =1;
	
		do{
		System.out.println("1. Dosa		40");
		System.out.println("2. Idli		20");
		System.out.println("3. Upma		30");
		System.out.println("4. Utaapa		40");
		System.out.println("5. Samosa		10");
		System.out.println("6. Sabudana kichdi	35");
		System.out.println("7. Halwa		25");
		System.out.println("8. Poha		20");
		System.out.println("9. Tea		10");
		System.out.println("10. Generate bill ");
		
		System.out.print("Enter your choice : ");
		choice = input.nextInt();
		if(choice!=10){
			System.out.print("Enter quantity : ");
			q = input.nextInt();
		}
		 
		switch(choice){
			case 1 : bill+=(40*q);
			break;
			case 2 : bill+=(20*q);
			break;
			case 3 : bill+=(30*q);
			break;
			case 4 : bill+=(40*q);
			break;
			case 5 : bill+=(10*q);
			break;
			case 6 : bill+=(35*q);
			break;
			case 7 : bill+=(25*q);
			break;
			case 8 : bill+=(20*q);
			break;
			case 9 : bill+=(10*q);
			break; 
		} 
		
		}while(choice!=10);
		
		
		System.out.println("Your total is : "+ bill);
		
	}
}
