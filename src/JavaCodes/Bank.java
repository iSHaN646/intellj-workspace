//Bank login credentials using this on 11 april 
package JavaCodes;
import java.util.Scanner;
class Bank 
{
	int total=100;
	String username="pub@gmail.com";
	int password=12345;

	public int login(String username,int password){
		if(this.username.equals(username) && this.password==password){
			return 1;
		}else{
			return 0;
		}
	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter username: ");
		String username=sc.next();
		System.out.print("enter password: ");
		int password=sc.nextInt();
		Bank b=new Bank();
		int result=b.login(username,password);
		if(result==1){
			System.out.println("You are successfully logged in!");
		}else{
			System.out.println("Wrong Credentials");
		}

		
		
	}
}
