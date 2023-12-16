//package Trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	class Node{
		int data;
		Node right, left;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	
	public void inputLevelwise() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		root = node1;
		root.left = node2;
		root.right = node3;
		root.left.left = node4;
		root.left.right = node5;
		root.right.left = node6;
		root.right.right = node7;
		
	}
	public void rDisplayPreOrder() {
		displayPreOrder(root);
	}
	
	public void displayPreOrder(Node root) {
		
		if(root!=null) {
			System.out.print(root.data+" ");
			displayPreOrder(root.left);
			displayPreOrder(root.right);
		}
	}
	
	public void PreOrder() {
		System.out.print("PreOrder : ");
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.data+ " ");
			if(node.right!=null) stack.push(node.right);
			if(node.left!=null) stack.push(node.left);
			
		}
	}
	
	public void rDisplayInOrder() {
		displayInOrder(root);
	}
	
	public void displayInOrder(Node root) {
		
		if(root!=null) {
			
			displayInOrder(root.left);
			System.out.print(root.data+" ");
			displayInOrder(root.right);
		}
	}
	
	public void inOrder() {
		
			Stack<Node> s = new Stack<Node>();
			
			Node currNode = root;
			boolean done = false;
			while(!done) {
				if(currNode!=null) {
					s.push(currNode);
					currNode = currNode.left;
				}else {
					if(!s.isEmpty()) {
						currNode = s.pop();
						System.out.print(currNode.data+" ");
						currNode = currNode.right;
					}else done=true;
				}
			}
				
			
	}
	
	public void postOrder() {
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		Node prev = null;
		while(!s.isEmpty()) {
			Node curr = s.peek();
			if(prev==null || prev.left == curr || prev.right== curr) {
				if(curr.left!=null) s.push(curr.left);
				else if(curr.right!=null) s.push(curr.right);
				
			}
			
			else if(curr.left == prev) {
				if(curr.right!=null) s.push(curr.right);
			}
			else {
					System.out.print(curr.data+" ");
					s.pop();
			}
				
				prev = curr;
				
			
		}
	}
	
	public void oddOrder() {
		if(root!=null) {
			Queue<Node> s = new LinkedList<Node>() ;
			s.add(root);
			int level=1;
			
			int count=1;
			//System.out.println("in odd");
			while(!s.isEmpty()) {
				int levelCount=s.size();
				
				//System.out.println("in while");
				if(level%2!=0) {
					
					while(levelCount!=0) {
						//System.out.println("in second while");
						Node n =s.remove();
						System.out.print(n.data+" ");
						if(n.left!=null) {
							s.add(n.left);
						}
						if(n.right!=null) {
							s.add(n.right);
							
						}
						levelCount--;
					}
				}else {
					
					while(levelCount!=0) {
						Node n =s.remove();
						//System.out.println(n.data+" ");
						if(n.left!=null) {
							s.add(n.left);count++;
						}
						if(n.right!=null) {
							s.add(n.right);
							count++;
						}
						levelCount--;
					}
				}
				level++;
			}
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.inputLevelwise();
		System.out.print("PreOrder recursively : ");
		tree.rDisplayPreOrder();
		tree.PreOrder();
		System.out.println();
		System.out.print("InOrder recursively : ");
		tree.rDisplayInOrder();
		
		System.out.print("InOrder : ");
		tree.inOrder();
		System.out.println();
		System.out.print("Postorder : ");
		tree.postOrder();
		System.out.print("Odd level : ");
		tree.oddOrder();
	}
}
