package FundamentalJavai;

import java.util.Scanner;

public class Arrays {

	public static int BinarySearch(int arr[],int x) {
		int s=0,e=arr.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(arr[mid]<x) {
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		return -1;
	}
	
	public static void SelectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min=Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
	
	public static void BubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void InsertionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else {
					break;
				}
			}
		}
	}
	
	public static int[] MergeTwoSortedArr(int arr1[],int arr2[]) {
		int i=0,j=0,k=0;
		int result[]=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k]=arr1[i];
				i++;k++;
			}else {
				result[k]=arr2[j];
				j++;k++;
			}
		}
		while(i<arr1.length) {
			result[k]=arr1[i];
			i++;k++;
		}
		while(j<arr2.length) {
			result[k]=arr2[j];
			j++;k++;
		}
		return result;
		
	}
	
	public static void Push0sToEnd(int arr[]) {
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k++;
			}
		}
		
	}
	
	public static void RotateArr(int arr[],int d) {
		int temp[]=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=0;i<(arr.length-d);i++) {
			arr[i]=arr[i+d];
		}
		for(int i=0;i<d;i++) {
			arr[arr.length-d+i]=temp[i];
		}
	}
	
	public static int SecondLargest(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int seclargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				seclargest=largest;
				largest=arr[i];
			}else if(arr[i]>seclargest && largest!=arr[i]) {
				seclargest=arr[i];
			}
		}
		return seclargest;
	}
	
	public static int CheckArrRot(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return (i+1);
			}
		}
		return 0;
	}
	
	public static void Sort012(int arr[]) {
		int i=0,nz=0,nt=arr.length-1;
		while(i<=nt) {
			if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[nz];
				arr[nz]=temp;
				i++;nz++;
			}else if(arr[i]==2) {
				int temp=arr[i];
				arr[i]=arr[nt];
				arr[nt]=temp;
				nt--;
			}else {
				i++;
			}
		}
	}

	public static void separateDigitsInArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			int elem=arr[i];
			int rev=0;
			while(elem!=0){
				int rem=elem%10;
				rev=rev*10+rem;
				elem/=10;
			}

			while(rev!=0){
				System.out.print(rev%10+" ");
				rev/=10;
			}
		}

	}

	public static void revArrInGrps(int arr[],int k){
		for(int i=0;i<arr.length;i+=k){
			int start=i;
			int end=Math.min(i+k-1,arr.length-1);
			while(start<end){
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
//		all codes of hello.java included
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		revArrInGrps(arr1,2);

		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}

}
