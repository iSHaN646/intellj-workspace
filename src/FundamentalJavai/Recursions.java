package FundamentalJavai;

import java.util.Scanner;

public class Recursions {
	
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		return power(x,n-1)*x;
	}
	
	public static void Print1toN(int n) {
		if(n==0) {
			return;
		}
	    Print1toN(n-1);
	    System.out.print(n+" ");
	}
	
	public static int NoOfDig(int n) {
		if(n/10==0) {
			return 1;
		}
		if(n==0) {
			return 1;
		}
		return NoOfDig(n/10)+1;
	}
	
	public static int fibNo(int n) {
		if(n==0) {
			return 0;
		}if(n==1) {
			return 1;
		}
		return fibNo(n-1)+fibNo(n-2);
	}
	
	public static boolean CheckSorted(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int temp[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			temp[i-1]=arr[i];
		}
		return CheckSorted(temp);
	}
	public static boolean CheckSorted(int arr[],int s) {
		if(s>=arr.length-1) {
			return true;
		}
		if(arr[s]>arr[s+1]) {
			return false;
		}
		
		return CheckSorted(arr,s+1);
	}
	
	public static int SumOfArr(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int temp[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			temp[i-1]=arr[i];
		}
		return SumOfArr(temp)+arr[0];
	}
	public static int SumOfArr(int arr[],int s) {
		if(arr.length==s) {
			return 0;
		}
		
		return SumOfArr(arr,s+1)+arr[s];
	}
	
	public static boolean CheckNoInArr(int arr[],int n) {
		if(arr.length==0) {
			return false;
		}
		if(arr[0]==n) {
			return true;
		}
		int temp[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			temp[i-1]=arr[i];
		}
		return CheckNoInArr(temp,n);
	}
	public static boolean CheckNoInArr(int arr[],int n,int s) {
		if(s==arr.length) {
			return false;
		}
		if(arr[s]==n) {
			return true;
		}
		
		return CheckNoInArr(arr,n,s+1);
	}
	
	private static int FirstIndex(int arr[],int x,int s) {
		if(s>=arr.length) {
			return -1;
		}
		if(arr[s]==x) {
			return s;
		}
		return FirstIndex(arr,x,s+1);
		
	}
	
	public static int FirstIndex(int arr[],int x) {
		return FirstIndex(arr,x,0);
	}
	
//	private static int LastIndex(int arr[],int x,int e) {
//		if(e<0) {
//			return -1;
//		}
//		if(arr[e]==x) {
//			return e;
//		}
//		return LastIndex(arr,x,e-1);
//	}
	private static int LastIndex(int arr[],int x,int s) {
		if(s>=arr.length) {
			return -1;
		}
		int ans=LastIndex(arr,x,s+1);
		if(ans!=-1) {
			return ans;
		}
		if(arr[s]==x) {
			return s;
		}else {
			return -1;
		}
	}
	public static int LastIndex(int arr[],int x) {
		return LastIndex(arr,x,0);
	}
	
	public static int[] AllIndices(int arr[],int x,int s) {
		if(s==arr.length) {
			int ans[]=new int[0];
			return ans;
		}
		int ans[]=AllIndices(arr,x,s+1);
		if(arr[s]==x) {
			int ans1[]=new int[ans.length+1];
			ans1[0]=s;
			for(int i=0;i<ans.length;i++) {
				ans1[i+1]=ans[i];
			}
			return ans1;
		}else {
			return ans;
		}		
	}
	
	public static int mult(int a,int b) {
		if(b==0) {
			return 0;
		}
		return mult(a,b-1)+a;
	}
	
	public static int NoOfZeroes(int n) {
		if(n/10==0) {
			if(n==0) {
				return 1;
			}
			return 0;
		}
		if(n==0) {
			return 1;
		}
		   int ans= NoOfZeroes(n/10);
		   if(n%10==0) {
			   return ans+1;
		   }
		   return ans;
	}
	
	public static double GeometricSum(int k) {
		if(k==0) {
			return 1;
		}
		return GeometricSum(k-1)+ 1/(Math.pow(2,k));
	}
	
	public static boolean palindrome(String str) {
		if(str.length()<=1) {
			return true;
		}
		if(str.charAt(0)!=str.charAt(str.length()-1)) {
			return false;
		}
		return palindrome(str.substring(1,str.length()-1));
	}
	
	public static int SumOfDig(int n) {
		if(n/10==0) {
			return n;
		}
		if(n==0) {
			return 0;
		}
		return SumOfDig(n/10)+n%10;
	}
	
	public static String RemChar(String str,char ch) {
		if(str.length()==0) {
			return "";
		}
		String ans=RemChar(str.substring(1),ch);
		if(str.charAt(0)==ch) {
			return ans;
		}
		ans=str.charAt(0)+ans;
		return ans;
	}
	
	public static String ReplaceChar(String str,char c1,char c2) {
		if(str.length()==0) {
			return "";
		}
		String ans=ReplaceChar(str.substring(1),c1,c2);
		if(str.charAt(0)==c1) {
			ans=c2+ans;
			return ans;
		}
		ans=str.charAt(0)+ans;
		return ans;
	}
	
	public static String RemDupl(String str) {
		if(str.length()<=1) {
			return str;
		}
		String ans=RemDupl(str.substring(1));
		if(str.charAt(0)==ans.charAt(0)) {
			return ans;
		}
		ans=str.charAt(0)+ans;
		return ans;
	}
	
	public static void MergeTwoSortArr(int arr[],int s,int e) {
		int size=e-s+1;
		int m=(s+e)/2;
		int ans[]=new int[size];
		int i=s,j=m+1,k=0;
		while(i<=m && j<=e) {
			if(arr[i]<arr[j]) {
				ans[k]=arr[i];
				i++;k++;
			}else {
				ans[k]=arr[j];
				j++;k++;
			}
		}
		while(i<=m) {
			ans[k]=arr[i];
			i++;k++;
		}while(j<=e) {
			ans[k]=arr[j];
			j++;k++;
		}
		int p=0;
		for(int i1=s;i1<=e;i1++) {
			arr[i1]=ans[p];
			p++;
		}
	}
	public static void MergeSort(int arr[],int s,int e) {
		if(s>=e) {
			return;
		}
		int m=(s+e)/2;
		MergeSort(arr,s,m);
		MergeSort(arr,m+1,e);
		MergeTwoSortArr(arr,s,e);
		
	}
	
	public static int Partition(int arr[],int s,int e) {
		int pivot=arr[s];
		int c=0;
		for(int i=s+1;i<=e;i++) {
			if(arr[i]<=pivot) {
				c++;
			}
		}
		int pivotpos=s+c;
		arr[s]=arr[pivotpos];
		arr[pivotpos]=pivot;
		int i=s,j=e;
		while(i<pivotpos && j>pivotpos) {
			if(arr[i]>arr[pivotpos] && arr[j]<=arr[pivotpos]) {
				int temp1=arr[i];
				arr[i]=arr[j];
				arr[j]=temp1;
				i++;j--;
			}else if(arr[i]<=arr[pivotpos]) {
				i++;
			}else if(arr[j]>arr[pivotpos]) {
				j--;
			}
		}
		return pivotpos;
		
	}
	
	public static void QuickSort(int arr[],int s,int e) {
		if(s>=e) {
			return;
		}
		int pivotpos= Partition(arr,s,e);
		QuickSort(arr,s,pivotpos-1);
		QuickSort(arr,pivotpos+1,e);
	}
	
	public static String ReplacePi(String str) {
		if(str.length()<=1) {
			return str;
		}
		String ans=ReplacePi(str.substring(1));
		if(str.charAt(0)=='p' && ans.charAt(0)=='i') {
			ans=ans.substring(1);
			ans="3.14"+ans;
			return ans;
		}
		ans=str.charAt(0)+ans;
		return ans;
		
	}
	
	public static String RemoveX(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans=RemoveX(str.substring(1));
		if(str.charAt(0)!='x') {
			ans=str.charAt(0)+ans;
			return ans;
		}
		return ans;
	}
	
	public static int StrToInt(String str) {
		if(str.length()==1) {
			return str.charAt(0)-'0';
		}
		int ans=StrToInt(str.substring(0,str.length()-1));
		int b=str.charAt(str.length()-1)-'0';
		ans=ans*10+b;
		return ans;
	}
	
	public static String PairStar(String str) {
		if(str.length()<=1) {
			return str;
		}
		String ans=PairStar(str.substring(1));
		if(str.charAt(0)!=ans.charAt(0)) {
			ans=str.charAt(0)+ans;
			return ans;
		}
		ans=str.charAt(0)+"*"+ans;
		return ans;
	}
	
	public static void TowerOfHanoi(int n,char s,char a,char d) {
		if(n==0) {
			return;
		}
		TowerOfHanoi(n-1,s,d,a);
		System.out.println(s+" "+d);
		TowerOfHanoi(n-1,a,s,d);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		TowerOfHanoi(n,'a','b','c');
		
	}

}
