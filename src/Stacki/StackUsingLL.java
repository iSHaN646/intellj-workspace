package Stacki;

public class StackUsingLL {

	public class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	private Node head;
	private int size;
	
	public StackUsingLL() {
		head=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(int elem) {
		Node newnode=new Node(elem);
		newnode.next=head;
		head=newnode;
		size++;
	}
	
	public int pop() {
		if(head==null) {
			return -1;
		}
		int temp= head.data;
		head=head.next;
		size--;
		return temp;
	}
	
	public int top() {
		if(head==null) {
			return -1;
		}
		return head.data;
	}
	
	
}
