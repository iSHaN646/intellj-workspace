package LinkedList;

import java.util.Scanner;

public class LinkedlistUse {
	
	public static int length(Node head) {
		int c=0;
		Node curr=head;
		while(curr!=null) {
			c++;
			curr=curr.next;
		}
		return c;
	}
	
	public static void printithNode(Node head,int i) {
		Node curr=head;
		int pos=0;
		while(curr!=null && pos<i) {
			curr=curr.next;
			pos++;
		}
		if(curr!=null) {
			System.out.println(curr.data);
		}
	}
	
	public static Node takeInput() {
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node head=null,tail=null;
		while(data!=-1) {
			Node curr=new Node(data);
			if(head==null) {
				head=curr;
				tail=curr;
			}else {
				tail.next=curr;
				tail=curr;
			}
			data=sc.nextInt();
		}
		return head;
	}
	
	public static Node InsertNode(Node head,int i,int data) {
		Node newnode=new Node(data);
		int pos=1;
		Node curr=head;
		if(i==0 || head==null) {
			newnode.next=head;
			head=newnode;
			return head;
		}
		while(curr!=null && pos<i) {
			curr=curr.next;
			pos++;
		}
		
		if(curr!=null) {
			newnode.next=curr.next;
			curr.next=newnode;
		}
		return head;
	}
	
	public static Node DeleteNode(Node head,int i) {
		if(head==null) {
			return head;
		}
		if(i==0) {
			head=head.next;
			return head;
		}
		int pos=1;
		Node curr=head;
		while(curr!=null && pos<i) {
			curr=curr.next;
			pos++;
		}
		if(curr!=null && curr.next!=null) {
			curr.next=curr.next.next;
		}
		return head;
	}
	
	public static int findNode(Node head,int data) {
		if(head==null) {
			return -1;
		}
		int index=0;
		Node curr=head;
		while(curr!=null) {
			if(curr.data==data) {
				return index;
			}
			curr=curr.next;
			index++;
		}
		return -1;
	}
	
	public static int FindNodeRec(Node head,int ele) {
		if(head==null) {
			return -1;
		}
		int ans= FindNodeRec(head.next,ele);
		if(ans!=-1) {
			return ans+1;
		}
		if(head.data==ele) {
			return 0;
		}
		return -1;
	}
	
	public static Node EvenAfterOdd(Node head) {
		Node curr=head,oddhead=null,oddtail=null,evenhead=null,eventail=null;
		while(curr!=null) {
			if(curr.data%2!=0) {
				if(oddhead==null) {
					oddhead=curr;
					oddtail=curr;
					curr=curr.next;
				}else {
					oddtail.next=curr;
					oddtail=curr;
					curr=curr.next;
				}
			}
				else {
					if(evenhead==null) {
						evenhead=curr;
						eventail=curr;
						curr=curr.next;
					}else {
						eventail.next=curr;
						eventail=curr;
						curr=curr.next;
					}
				}
			}
		if(oddhead==null) {
			return evenhead;
		}else {
			oddtail.next=evenhead;
		}
		if(evenhead!=null) {
			eventail.next=null;
		}
		
		return oddhead;
	}
	
	public static Node AppendLastNToFirst(Node head,int n) {
		if(head==null || head.next==null) {
			return head;
		}
		int len=length(head);
		int i=len-n;
		int pos=1;
		Node curr=head;
		Node currhead=null;
		while(curr!=null && pos<i) {
			curr=curr.next;
			pos++;
		}
		if(curr!=null) {
			currhead=curr.next;
			curr.next=null;
			curr=currhead;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=head;
		}
		return currhead;
	}
	
	public static Node EliminateDupl(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node curr=head;
		while(curr!=null && curr.next!=null) {
			if(curr.data==curr.next.data) {
				curr.next=curr.next.next;
			}else {
				curr=curr.next;
			}
		}
		return head;
	}
	
	public static void printRev(Node head) {
		if(head==null) {
			return;
		}
		printRev(head.next);
		System.out.print(head.data+" ");
	}
	
	public static void printRec(Node head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printRec(head.next);
	}
	
	public static Node InsertNodeRec(Node head,int i,int data) {
		Node newnode=new Node(data);
		if(i==0 && head==null) {
			newnode.next=head;
			head=newnode;
			return head;
		}
		if(head==null && i>0) {
			return head;
		}
		Node rechead=InsertNodeRec(head.next,i-1,data);
		head.next=rechead;
		return head;
	}
	
	public static Node DeleteNodeRec(Node head,int i) {
		if(head==null) {
			return head;
		}
		if(i==0) {
			head=head.next;
			return head;
		}
		Node rechead= DeleteNodeRec(head.next,i-1);
		head.next=rechead;
		return head;
	}
	
	public static Node RevRec(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node rechead= RevRec(head.next);
		Node curr=rechead;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=head;
		head.next=null;
		return rechead;
	}
	
	public static DoubleNode RevRecBetter(Node head) {
		DoubleNode ans;
		if(head==null || head.next==null) {
			ans=new DoubleNode(head,head);
			return ans;
		}
		DoubleNode smallans= RevRecBetter(head.next);
		smallans.tail.next=head;
		head.next=null;
		ans=new DoubleNode(smallans.head,head);
		return ans;
	}
	
	public static Node RevRecBest(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node rechead= RevRec(head.next);
		Node tail= head.next;
		tail.next=head;
		head.next=null;
		return rechead;
	}
	
	public static Node RevIter(Node head) {
		Node prev=null,curr=head;
		while(curr!=null) {
			Node fwd= curr.next;
			curr.next=prev;
			prev=curr;
			curr=fwd;
		}
		return prev;
	}
	
	public static Node mergeTwoSortedll(Node h1,Node h2) {
		if(h1==null) {
			return h2;
		}
		if(h2==null) {
			return h1;
		}
		Node t1=h1,t2=h2,head=null,tail=null;
		if(t1.data<=t2.data) {
			head=t1;
			tail=t1;
			t1=t1.next;
		}else {
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		while(t1!=null && t2!=null) {
			if(t1.data<=t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}else {
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		if(t1==null) {
			tail.next=t2;
		}
		if(t2==null) {
			tail.next=t1;
		}
		return head;
	}
	
	public static Node midpoint(Node head) {
		
		Node slow= head,fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static Node mergeSort(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node mid= midpoint(head);
		Node part1head=head,part2head=mid.next;
		mid.next=null;
		part1head= mergeSort(part1head);
		part2head= mergeSort(part2head);
		return mergeTwoSortedll(part1head,part2head);
		
	}
	
//	public static boolean palindrome(Node head) {
//		
//	}
	
	
	public static Node DeleteEveryNNODES(Node head,int n,int m) {
		if(n==0) {
			return null;
		}
		if(head==null) {
			return head;
		}
		
		Node curr=head,prev=null;
		int i=1;
		while(curr!=null) {
			while(curr!=null && i<n) {
				curr=curr.next;
				i++;
			}
			prev=curr;
			i=0;
			while(curr!=null && i<=m) {
				curr=curr.next;
				i++;
			}
			if(prev==null) {
				return head;
			}
			prev.next=curr;
			prev=curr;
			i=1;
		}
		return head;
	}
	
	public static Node swapTwoNodes(Node head,int n,int m) {
		if(head==null || head.next==null) {
			return head;
		}
		if(n==m) {
			return head;
		}
		
		Node p1=null,c1=head,p2=null,c2=head;
		int i=1;
			while(c1!=null && i<=n) {
				p1=c1;
				c1=c1.next;
				i++;
			}
			i=1;
			while(c2!=null && i<=m) {
				p2=c2;
				c2=c2.next;
				i++;
			}
			if(p1!=null) {
			p1.next=c2;
			}
			if(p2!=null && p2!=c1) {
				p2.next=c1;
			}
			if(c2.next==null) {
				c2.next=c1.next;
				c1.next=null;
			}else {
				
				c1.next=c2.next;
			}
			if(c1==p2) {
				c2.next=c1;
			}
			if(p2==null) {
				c2.next=c1.next;
			}else {
				if(c2.next!=null) {
					c2.next=p2;
				}
			}
			
		if(n==0) {
			return c2;
		}
		if(m==0) {
			return c1;
		}
		return head;
	}
	
	public static void print(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
		

	public static void main(String[] args) {
		
		Node h1= takeInput();
		h1= swapTwoNodes(h1,0,6);
		print(h1);
	}

}
