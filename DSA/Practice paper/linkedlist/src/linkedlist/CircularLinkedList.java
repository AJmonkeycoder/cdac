package linkedlist;

import linkedlist.DoubleLinkedList.Node;

public class CircularLinkedList {
	class Node{
		int data;
		//Node prev;
		Node next;
		
		
		Node(int data){
			this.data = data;
			//prev=null;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	//private static int l;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode ;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		
	}
	
	public void delete() {
		if(head==null) return;
		if(head.next==null) {
			head=null;
			tail=null;
		}
		else if(head!=null) {
			Node curr = head;
			while(curr.next!=tail) {
				
				curr = curr.next;
			}
			tail=curr;
			tail.next=head;
		}
	}
	
	@Override
	public String toString() {
		String ans="";
		if(head == null) return "Ll is empty";
		Node curr = head;
		while(curr!=tail) {
			ans+=curr.data + " ";
			curr = curr.next;
		}
		ans+=tail.data;
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList ll = new CircularLinkedList();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
//		ll.add(4);
//		ll.add(5);
//		ll.add(6);
		
		//ll.deleteFirst();
		//ll.deleteLast();
		//ll.deleteAtIndex(234);
//		System.out.println(ll);
		System.out.println(ll);
		
		//ll.reverse();
		ll.delete();
		System.out.println(ll);
//		System.out.println("reverse");
	}
	
}
