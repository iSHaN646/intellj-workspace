package FundamentalJavai;

import java.util.Scanner;

public class Strings {
	
	public static int CountWords(String str) {
		if(str.length()==0) {
			return 0;
		}
		int c=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				c++;
			}
		}
		return c;
	}
	
	public static String RevString(String str) {
		StringBuilder ans= new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			ans.append(str.charAt(i));
		}
		return ans.toString();
	}
	
	public static boolean CheckPalindrome(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!= str.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
	}
	
	public static void PrintSubstr(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.print(str.substring(i,j+1)+" ");
			}
		}
	}
	
	public static String RevEachWord(String str) {
		StringBuilder ans= new StringBuilder();
		int CurrWordStart=0;
		int i=0;
		for(;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				int CurrWordEnd=i-1;
				StringBuilder RevWord= new StringBuilder();
				for(int j=CurrWordEnd;j>=CurrWordStart;j--) {
					RevWord.append(str.charAt(j));
				}
				ans.append(RevWord).append(" ");
				CurrWordStart=i+1;
			}
		}
		int CurrWordEnd=i-1;
		StringBuilder RevWord= new StringBuilder();
		for(int j=CurrWordEnd;j>=CurrWordStart;j--) {
			RevWord.append(str.charAt(j));
		}
		ans.append(RevWord);
		
		return ans.toString();
		
	}
	
	public static void PrintSubstrLenWise(String str) {
		for(int len=1;len<=str.length();len++) {
			for(int start=0;start<=str.length()-len;start++) {
				int end=start+len-1;
				System.out.print(str.substring(start,end+1)+" ");
			}
		}
	}
	
	public static boolean CheckPermutation(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		int arr[]=new int[256];
		for(int i=0;i<str1.length();i++) {
			arr[str1.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++) {
			arr[str2.charAt(i)]--;
		}
		for(int i=0;i<256;i++) {
			if(arr[i]!=0) {
				return false;
			}
		}
		return true;
	}
	
	public static String RemConsDupl(String str) {
		StringBuilder ans= new StringBuilder();
		ans.append(str.charAt(0));

		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==ans.charAt(ans.length()-1)) {
				continue;
			}else {
				ans.append(str.charAt(i));
			}
		}
		return ans.toString();
		
	}
	
	public static String RemChar(String str,char ch) {
		StringBuilder ans= new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				continue;
			}else {
				ans.append(str.charAt(i));
			}
		}
		return ans.toString();
	}
	
	public static char HighestOcc(String str) {
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		char ans=str.charAt(0);
		int count=arr[str.charAt(0)];
		for(int i=1;i<str.length();i++) {
			if(arr[str.charAt(i)]>count) {
				ans=str.charAt(i);
				count=arr[str.charAt(i)];
			}
		}
		return ans;
	}
	
	public static String CompressStr(String str) {
		StringBuilder ans= new StringBuilder();
		ans.append(str.charAt(0));
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}else {
				if(count>1) {
					ans.append(count);
					count=1;
				}
				ans.append(str.charAt(i));
				
			}
		}
		if(count>1) {
			ans.append(count);
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.nextLine();
		System.out.println(CompressStr(str1));
	}

}
