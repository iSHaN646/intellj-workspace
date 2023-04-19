package Stacki;

public class StackUsingArr {
	
	private int arr[];
	private int top;
	
	public StackUsingArr(int size) {
		arr=new int[size];
		top=-1;
	}
	
	public int top() {
		if(top==-1) {
			return -1;
		}
		return arr[top];
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int elem) {
		if(full()) {
			return;
		}
		top++;
		arr[top]=elem;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int temp=arr[top];
		top--;
		return temp;
	}

	private boolean full() {
		return top==arr.length-1;
	}

	public void removeMiddle(){
		rmMiddle(0,size());

	}

	private void rmMiddle(int c, int size) {
		if(c==size/2){
			pop();
			return;
		}
		int num=top();
		pop();
		rmMiddle(c+1,size);
		push(num);
	}
}
