// Addition and subtraction function on 11 april
package JavaCodes;
import java.util.Scanner;
class Functions
{
	public static void add(int a,int b){
		System.out.println("addition: " + (a+b));
	}

	public static void subt(int a,int b){
		System.out.println("subtraction: " + (a-b));
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a: ");
		int a=sc.nextInt();
		System.out.print("enter b: ");
		int b=sc.nextInt();
		add(a,b);
		subt(a,b);

	}
}
