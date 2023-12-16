package linkedlist;

public class DoubleLinkedList {
	// addfirst
	// addlast
	// addatindex
	// delete first, last, atindex
	// toString 
	// reverse
	class Node{
		int data;
		Node prev;
		Node next;
		
		//constructor
		Node(int data){
			this.data = data;
			prev=null;
			next = null;
		}
	}
	
	private Node head;
	private static int l;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) head = newNode ;
		else addAtIndex(data, 0);
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) head = newNode ;
		Node curr = head;
		while(curr.next!=null) {
			
			curr = curr.next;
		}
		curr.next = newNode;
		newNode.prev = curr;
	}
	//add at index
	public void addAtIndex(int data, int i) {
		Node node = new Node(data);
		int count=0;
		
		Node currNode = head;
		while(count<i-1 && currNode.next!=null) {
			currNode = currNode.next;
			count++;
			
		}
		
		if(count==i-1) {
			
			Node n = currNode.next;
			currNode.next = node;
			n.prev = node;
			node.next = n;
			node.prev = currNode;
			
			l++;
			
		}else {
			System.out.println("index out of bound");
		}
			
	}
	
	public void deleteFirst() {
		head= head.next;
		l--;
	}
	public void deleteLast() {
		Node curr = head;
		Node prev = curr;
		while(curr.next!=null) {
				prev = curr;
			curr = curr.next;
		}
		prev.next = null;
		l--;
	}
	// delete at index
	public void deleteAtIndex(int i) {
		Node currNode = head;
		int count = 0;
		while(count<i-1 && currNode.next!=null) {
			currNode = currNode.next;
			count++;
		}
		
		if(count==i-1) {
		
			currNode.next = currNode.next.next;
			currNode.next.prev = currNode;
			l--;
		
			
		}else {
			System.out.println("index out of bound");
		}
	}

	/*
	 * public void reverse() { Node curr = head;
	 * 
	 * while(curr.next!=null) {
	 * 
	 * curr = curr.next; } int count=0; ) }
	 */
	public void displayReverse() {
		Node curr = head;
		
		while(curr.next!=null) {
			
			curr = curr.next;
		}
		
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.prev;
		}
	}
	
	
	 public void reverse() {
		  Node curr = head;
		  
		  while(curr.next!=null) { 
			  curr = curr.next;
			  }
		  Node head2 = curr;
	  
		 while(curr.prev!=null) {
		
			 Node next = curr.next;
			 curr.next = curr.prev;
			
			  Node curr2 = curr;
			 curr = curr.prev;
			curr2.prev =next;
		 }
		 head.prev = head.next;
		  head.next = null;
	
		  head = head2;
		 
		  Node curr3 = head;
		  int count =0;
		  while(curr3!=null && count<10)
		  { 
			  System.out.println(curr3.data + " "); 
	
			  curr3 = curr3.next; 
			  count++; 
		  }
		 }
	 //public void reverse2()
	@Override
	public String toString() {
		String ans="";
		if(head == null) return "Ll is empty";
		Node curr = head;
		while(curr!=null) {
			ans+=curr.data + " ";
			curr = curr.next;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList ll = new DoubleLinkedList();
		ll.addFirst(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addAtIndex(6, 2);
		
		//ll.deleteFirst();
		//ll.deleteLast();
		ll.deleteAtIndex(234);
//		System.out.println(ll);
		System.out.println(ll);
		
		ll.reverse();
		ll.displayReverse();
		System.out.println(ll);
//		System.out.println("reverse");
	}

}
