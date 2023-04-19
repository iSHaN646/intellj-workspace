//Bank Details class storing details of customer on 12 april
package JavaCodes;
import java.util.Scanner;
class BankDetails 
{
	String acc_no;
	String name;
	String acc_type;
	long balance;

	public void openAccount(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter acc_no: ");
		this.acc_no = sc.next();
		System.out.print("enter name: ");
		this.name = sc.next();
		System.out.print("enter acc_type: ");
		this.acc_type = sc.next();
		System.out.print("enter balance: ");
		this.balance = sc.nextLong();
	}

	public void getDetails(){
		System.out.println("acc_no: " + this.acc_no);
		System.out.println("name: " + this.name);
		System.out.println("acc_type: " + this.acc_type);
		System.out.println("balance: " + this.balance);
	}
}
