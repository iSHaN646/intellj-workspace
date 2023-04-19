package FundamentalJavai;

import java.util.Scanner;

public class TwoDimArr {
	
	public static void RowWiseSum(int arr[][]) {
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<m;j++) {
				sum+=arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}
	
	public static int LargestColSum(int arr[][]) {
		int m=arr[0].length;
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<m;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=arr[j][i];
			}
			if(sum>max) {
				max=sum;
			}
		}
		return max;
	}
	
	public static void LargRorCsum(int arr[][]) {
		int maxSum=Integer.MIN_VALUE,index=-1;
		int n=arr.length;
		int m=arr[0].length;
		boolean isRow=true;
		for(int i=0;i<n;i++) {
			int Rowsum=0;
			for(int j=0;j<m;j++) {
				Rowsum+=arr[i][j];
			}
			if(Rowsum>maxSum) {
				maxSum=Rowsum;
				index=i;
			}
		}
		for(int i=0;i<m;i++) {
			int Colsum=0;
			for(int j=0;j<n;j++) {
				Colsum+=arr[j][i];
			}
			if(Colsum>maxSum) {
				isRow=false;
				maxSum=Colsum;
				index=i;
			}
		}
		if(isRow) {
			System.out.println("row "+ index+ " "+ maxSum);
		}else {
			System.out.println("column "+ index+ " "+ maxSum);
		}
		
	}
	
	public static void WavePrint(int arr[][]) {
		int n=arr.length;
		int m=arr[0].length;
		 for(int j=0;j<m;j++) {
			if(j%2==0) {
				for(int i=0;i<n;i++) {
					System.out.print(arr[i][j]+" ");
				}
			}else {
				for(int i=n-1;i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		 }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		WavePrint(arr);
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}

	}

}
