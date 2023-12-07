import java.util.Scanner;

public class CircularLinkedList {
	Node head;
	Node tail;
	private class Node{
		int data;
		Node next;
	
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void insert(int data) {
		if(head == null) {
			Node newNode = new Node(data);
			head = newNode;
			head.next = head;
			tail=head;
		}
		else {
			head = insert(head, data );
		}
	}
	
	
	public Node insert(Node node, int data) {
		if(node.next == head) {
			Node newNode = new Node(data);
			node.next = newNode;
			newNode.next = head;
			return head;
		}
		return insert(node.next, data);
		
	}
	
	public void display() {
		if(head == null) {
			System.out.println("Circular Linked List is empty");
			return;
		}
		Node node = head;
		while(node.next != head) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public void remove() {
		if(head == null) {
			System.out.println("Circular Linked List is empoty");
			return;
		}
		Node node = head;
		Node tail = head;
		while(tail.next!=head) {
			node = tail;
			tail = node.next;
		}
		if(node == head) head = null;
		node.next = head;
	}
	
	public int size() {
		if(head == null) return 0;
		Node node = head;
		int count = 0;
		while(node.next != head && head!=null) {
			count++;
			node = node.next;
		}
		
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList d = new CircularLinkedList();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.insert(4);
		d.insert(5);
		d.insert(6);
		
		while(!exit) {
			System.out.println("1-> Insert\n"
					+ "2-> Display\n"
					+ "3-> Remove\n"
					+ "4-> Size");
			
			switch(sc.nextInt()) {
			//Insert element at last of linked list
			case 1 : 
				System.out.println("Enter a data");
				d.insert(sc.nextInt());
				break;
				
			// display linked list	
			case 2 : 
				d.display();
				System.out.println("\n");
				break;
				
			case 3 : 
				d.remove();
				break;	
				
			case 4 :
				System.out.println( "Number of element in linked list : " + d.size() );
				break;
			}
			
		}

	}

}
