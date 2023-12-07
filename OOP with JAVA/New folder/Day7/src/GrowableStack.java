
public class GrowableStack implements Stack {
	int top;
	Customer[] growStack;
	int size = stackSize;

	
	public GrowableStack() {
		top=-1;
	    growStack =new Customer[size];
	}
	
	@Override
	public void push(Customer customer) {
		// TODO Auto-generated method stub
		
		if(top<size-1) {
			growStack[++top]=customer;
		}else {
			int newStackSize = size*2;
			Customer[] newStack = new Customer[newStackSize];
			
			for(int i=0; i<size; i++) {
				newStack[i]=growStack[i];
			}
			
			size = newStackSize;
			growStack = newStack;
			
			growStack[++top] = customer;
		}

	}

	@Override
	public Customer pop() {
		// TODO Auto-generated method stub
		if(top>=0)
		return growStack[top--];
		else {
			System.out.println("Stack is empty");
		}
		return null;
		
	}

}
