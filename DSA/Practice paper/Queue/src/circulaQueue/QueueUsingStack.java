package circulaQueue;

import java.util.Stack;

public class QueueUsingStack {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		public void enQueue(int data) {
			s1.push(data);
		}
		
		public int deQueue() {
			if(s1.empty()) {
				System.out.println("queue is empty");
				return -1;
			}
			while(!s1.empty()) {
				s2.push(s1.pop());
			}
			int val=s2.pop();
			
			while(!s2.empty()) {
				s1.push(s2.pop());
			}
			return val;
		}
		
		public static void main(String[] args) {
			QueueUsingStack q = new QueueUsingStack();
			q.enQueue(1);
			q.enQueue(2);
			q.enQueue(3);
			System.out.println(q.deQueue()); 
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
		}
}
