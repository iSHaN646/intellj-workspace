package Stacki;

import java.util.Stack;

public class StackUse {
	
	public static boolean balancedPara(String str) {
		Stack<Character> stack =new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{') {
				stack.push(str.charAt(i));
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				if((str.charAt(i)==')' && stack.peek()=='(') ||
				   (str.charAt(i)==']' && stack.peek()=='[') ||
				   (str.charAt(i)=='}' && stack.peek()=='{')
				   ) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static boolean checkRedundantBracket(String str) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);

			if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/'){
				st.push(ch);
			}else if(ch==')'){
				//closing bracket
				boolean isRed=true;
				while(!st.isEmpty() && st.peek()!='('){
					char top=st.peek();
					if(top=='+' || top=='-' || top=='*' || top=='/'){
						isRed=false;
					}
					st.pop();
				}
				st.pop();
				if(isRed){
					return true;
				}
			}
		}
		return false;
	}



	public static void reverseStack(Stack<Integer> s,Stack<Integer> h) {
		if(s.size()==1) {
			return;
		}
		int temp=s.peek();
		s.pop();
		reverseStack(s,h);
		while(!s.isEmpty()) {
			h.push(s.pop());
		}
		s.push(temp);
		while(!h.isEmpty()) {
			s.push(h.pop());
		}
	}

	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();
//		Stack<Integer> helper = new Stack<>();


//		System.out.println(checkRedundantBracket("a+(b)+c"));
		
		
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(1);
//		stack.push(9);
		System.out.println(stack.top());
//		stack.removeMiddle();
//		reverseStack(stack,helper);
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
//		stack.pop();
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.size());
//		while(!stack.isEmpty()) {
//			System.out.println(stack.peek());
//			stack.pop();
//		}
		
	}

}
