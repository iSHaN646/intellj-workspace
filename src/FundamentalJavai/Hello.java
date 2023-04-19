package FundamentalJavai;

import java.util.Scanner;

public class Hello {
	
	public static int largest(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void RevArr(int arr[]) {
		for(int i=0;i<=(arr.length-1)/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	
	public static int least(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

	
	public static int linearSearch(int arr[],int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void fashion(int arr[]) {
		int s=0,e=arr.length-1,val=1;
		while(s<=e) {
			arr[s]=val;
			val++;
			if(s==e) {
				return;
			}
			arr[e]=val;
			val++;
			s++;
			e--;
		}
	}
	
	public static void PrintPairs(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("("+ arr[i]+ ","+ arr[j]+ ")");
			}
		}
	}
	
	public static void SwapAlternate(int arr[]) {
		for(int i=0;(i+1)<arr.length;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	public static int FindUnique(int arr[]) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans^=arr[i];
		}
		return ans;
	}
	
	public static int FindDuplicate(int arr[]) {
		int ans=0;
		for(int i=0;i<=(arr.length-2);i++) {
			ans^=i;
		}
		for(int i=0;i<arr.length;i++) {
			ans^=arr[i];
		}
		return ans;
	}
	
	public static void Intersection(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					arr2[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
	}
	
	public static int PairSum(int arr[],int x) {
		int c=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					c++;
				}
			}
		}
		return c;
	}
	
	public static void Sort01(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=1) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		RevArr(arr1);
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	    
		
		
	}

}
