import java.util.Scanner;

class Calc{
public static void main(String[] args){
	double num1=0;
	double num2=0;
	int op;
	Scanner input = new Scanner(System.in);
	
	do{
	
	
	
	
	System.out.println("1. Add ");
	System.out.println("2. subtract" );
	System.out.println("3. Multiply" );
	System.out.println("4. Divide" );
	System.out.println("5. Exit" );
	System.out.print("Enter your option : ");
	
	op=input.nextInt();
	
	if(op!=5){
	System.out.print("Enter first number : ");
	num1=input.nextDouble();
	System.out.print("Enter second number : ");
	num2=input.nextDouble();
	}
	double result;
	
	
	switch(op){
		case 1 : result = num1 + num2;
			 System.out.println("Ans = "+result);
		break;
		case 2 : result = num1 - num2;
			 System.out.println("Ans = "+result);
		break;
		case 3 : result = num1 * num2;
			 System.out.println("Ans = "+result);
		break;		
		case 4 : if(num2 ==0) System.out.println("Cant divide with zero") ; 
			else {
				result = num1 / num2;
			 	System.out.println("Ans = "+result);
			 }
		break;
	
	}
	
	}while(op!=5);
	
	}
}
