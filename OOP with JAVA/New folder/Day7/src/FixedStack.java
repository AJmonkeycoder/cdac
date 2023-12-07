//import java.util.Arrays;

public class FixedStack implements Stack {
	int top=-1;
	Customer[] stackArray;
	
	public FixedStack() {
		stackArray = new Customer[stackSize];
		top=-1;
	}
	@Override
	public void push(Customer cust) {
		// TODO Auto-generated method stub
		if(top<stackSize-1) {
			stackArray[++top]=cust;
		}else {
			System.out.println("Stack is full. Cannot push more customers");
		}
	}

	@Override
	public Customer pop() {
		// TODO Auto-generated method stub
		
		if(top>=0) {
			return stackArray[top--];
		}else { 
			System.out.println("Stack is Empty");
		}
		return null;
	}

}
