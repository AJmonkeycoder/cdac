package circulaQueue;

public class CircularQueue {
	private int size;
	private int[] arr;
	private int front;
	private int rear;
	private int len;
	public CircularQueue(int size) {
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
		len=0;
	}
	
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("queue is full");

		} else {
			arr[++rear%size] = data;
			rear=rear%size;
			len++;
			if (front == -1)
				front = 0;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		} else {
			int value = arr[front%size];
			if(front==rear) front=rear=-1;
			else front =++front%size;
			len--;
			return value;
		}
	}

	public int front() {
		return arr[front];
	}

	public int rear() {
		return arr[rear];
	}

	public boolean isFull() {
		if ((rear+1)%size==front)
			return true;
		return false;
	}
	public boolean isEmpty() {
		return front==-1 && rear==-1;
	}

	@Override
	public String toString() {
		if(isEmpty())
		return "CircularQueue is empty";
		String ans = "";
		int i=front;
		while(!(i%size == rear)) {
			
			ans+=arr[i]+" ";
			i=i++%size;
		}
		return ans;
	}

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q.isFull());
		q.enqueue(5);
		q.dequeue();
		q.dequeue();
		q.dequeue();
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println(q.isFull());
		System.out.println(q.isFull());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(7);
		System.out.println(q.front());
		System.out.println("rinning toString");  
		System.out.println(q);

	}
}
