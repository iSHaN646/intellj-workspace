package JavaCodes;
import java.util.Scanner;
class CalculatorUse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a: ");
		int a=sc.nextInt();
		System.out.print("enter b: ");
		int b=sc.nextInt();
		Calculator c=new Calculator();
		System.out.println(c.pow(a,b));

	}
}
